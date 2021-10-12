package com.xl.xim.client.service;

import com.xl.xim.client.vo.req.GroupReqVO;
import com.xl.xim.client.vo.req.LoginReqVO;
import com.xl.xim.client.vo.res.OnlineUsersResVO;
import com.xl.xim.client.vo.res.XIMServerResVO;
import com.xl.xim.router.api.vo.req.P2PReqVO;

import java.util.List;

/**
*
* @author: xl
* @date: 2021/8/5
**/
public interface RouteRequest {

    /**
     * 群发消息
     * @param groupReqVO 消息
     * @throws Exception
     */
    void sendGroupMsg(GroupReqVO groupReqVO) throws Exception;


    /**
     * 私聊
     * @param p2PReqVO
     * @throws Exception
     */
    void sendP2PMsg(P2PReqVO p2PReqVO)throws Exception;

    /**
     * 获取服务器
     * @return 服务ip+port
     * @param loginReqVO
     * @throws Exception
     */
    XIMServerResVO.ServerInfo getXIMServer(LoginReqVO loginReqVO) throws Exception;

    /**
     * 获取所有在线用户
     * @return
     * @throws Exception
     */
    List<OnlineUsersResVO.DataBodyBean> onlineUsers()throws Exception ;


    void offLine() ;

}
