package com.xl.xim.client.service.impl;

import com.xl.xim.client.client.XIMClient;
import com.xl.xim.client.thread.ContextHolder;
import com.xl.xim.common.kit.HeartBeatHandler;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Service
public class ClientHeartBeatHandlerImpl implements HeartBeatHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(ClientHeartBeatHandlerImpl.class);

    @Autowired
    private XIMClient ximClient;


    @Override
    public void process(ChannelHandlerContext ctx) throws Exception {

        //重连
        ContextHolder.setReconnect(true);
        ximClient.reconnect();

    }


}
