package com.xl.xim.client.client;

import com.xl.xim.client.config.AppConfiguration;
import com.xl.xim.client.init.XIMClientHandleInitializer;
import com.xl.xim.client.service.EchoService;
import com.xl.xim.client.service.MsgHandle;
import com.xl.xim.client.service.ReConnectManager;
import com.xl.xim.client.service.RouteRequest;
import com.xl.xim.client.service.impl.ClientInfo;
import com.xl.xim.client.thread.ContextHolder;
import com.xl.xim.client.vo.req.GoogleProtocolVO;
import com.xl.xim.client.vo.req.LoginReqVO;
import com.xl.xim.client.vo.res.XIMServerResVO;
import com.xl.xim.common.constant.Constants;
import com.xl.xim.common.protocol.XIMRequestProto;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.DefaultThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Component
public class XIMClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(XIMClient.class);

    private EventLoopGroup group = new NioEventLoopGroup(0, new DefaultThreadFactory("xim-work"));

    @Value("${xim.user.id}")
    private long userId;

    @Value("${xim.user.userName}")
    private String userName;

    private SocketChannel channel;

    @Autowired
    private EchoService echoService;

    @Autowired
    private RouteRequest routeRequest;

    @Autowired
    private AppConfiguration configuration;

    @Autowired
    private MsgHandle msgHandle;

    @Autowired
    private ClientInfo clientInfo;

    @Autowired
    private ReConnectManager reConnectManager;

    /**
     * ????????????
     */
    private int errorCount;

    @PostConstruct
    public void start() throws Exception {

        //?????? + ?????????????????????????????? ip+port
        XIMServerResVO.ServerInfo ximServer = userLogin();

        //???????????????
        startClient(ximServer);

        //??????????????????
        loginXIMServer();


    }

    /**
     * ???????????????
     *
     * @param ximServer
     * @throws Exception
     */
    private void startClient(XIMServerResVO.ServerInfo ximServer) {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new XIMClientHandleInitializer())
        ;

        ChannelFuture future = null;
        try {
            future = bootstrap.connect(ximServer.getIp(), ximServer.getXimServerPort()).sync();
        } catch (Exception e) {
            errorCount++;

            if (errorCount >= configuration.getErrorCount()) {
                LOGGER.error("??????????????????????????????[{}]???", errorCount);
                msgHandle.shutdown();
            }
            LOGGER.error("Connect fail!", e);
        }
        if (future.isSuccess()) {
            echoService.echo("Start xim client success!");
            LOGGER.info("?????? xim client ??????");
        }
        channel = (SocketChannel) future.channel();
    }

    /**
     * ??????+???????????????
     *
     * @return ?????????????????????
     * @throws Exception
     */
    private XIMServerResVO.ServerInfo userLogin() {
        LoginReqVO loginReqVO = new LoginReqVO(userId, userName);
        XIMServerResVO.ServerInfo ximServer = null;
        try {
            ximServer = routeRequest.getXIMServer(loginReqVO);

            //??????????????????
            clientInfo.saveServiceInfo(ximServer.getIp() + ":" + ximServer.getXimServerPort())
                    .saveUserInfo(userId, userName);

            LOGGER.info("ximServer=[{}]", ximServer.toString());
        } catch (Exception e) {
            errorCount++;

            if (errorCount >= configuration.getErrorCount()) {
                echoService.echo("The maximum number of reconnections has been reached[{}]times, close xim client!", errorCount);
                msgHandle.shutdown();
            }
            LOGGER.error("login fail", e);
        }
        return ximServer;
    }

    /**
     * ??????????????????
     */
    private void loginXIMServer() {
        XIMRequestProto.XIMReqProtocol login = XIMRequestProto.XIMReqProtocol.newBuilder()
                .setRequestId(userId)
                .setReqMsg(userName)
                .setType(Constants.CommandType.LOGIN)
                .build();
        ChannelFuture future = channel.writeAndFlush(login);
        future.addListener((ChannelFutureListener) channelFuture ->
                echoService.echo("Registry xim server success!")
        );
    }

    /**
     * ?????????????????????
     *
     * @param msg
     */
    public void sendStringMsg(String msg) {
        ByteBuf message = Unpooled.buffer(msg.getBytes().length);
        message.writeBytes(msg.getBytes());
        ChannelFuture future = channel.writeAndFlush(message);
        future.addListener((ChannelFutureListener) channelFuture ->
                LOGGER.info("??????????????????????????????={}", msg));

    }

    /**
     * ?????? Google Protocol ??????????????????
     *
     * @param googleProtocolVO
     */
    public void sendGoogleProtocolMsg(GoogleProtocolVO googleProtocolVO) {

        XIMRequestProto.XIMReqProtocol protocol = XIMRequestProto.XIMReqProtocol.newBuilder()
                .setRequestId(googleProtocolVO.getRequestId())
                .setReqMsg(googleProtocolVO.getMsg())
                .setType(Constants.CommandType.MSG)
                .build();


        ChannelFuture future = channel.writeAndFlush(protocol);
        future.addListener((ChannelFutureListener) channelFuture ->
                LOGGER.info("????????????????????? Google Protocol ??????={}", googleProtocolVO.toString()));

    }


    /**
     * 1. clear route information.
     * 2. reconnect.
     * 3. shutdown reconnect job.
     * 4. reset reconnect state.
     *
     * @throws Exception
     */
    public void reconnect() throws Exception {
        if (channel != null && channel.isActive()) {
            return;
        }
        //?????????????????????????????????
        routeRequest.offLine();

        echoService.echo("xim server shutdown, reconnecting....");
        start();
        echoService.echo("Great! reConnect success!!!");
        reConnectManager.reConnectSuccess();
        ContextHolder.clear();
    }

    /**
     * ??????
     *
     * @throws InterruptedException
     */
    public void close() throws InterruptedException {
        if (channel != null) {
            channel.close();
        }
    }
}
