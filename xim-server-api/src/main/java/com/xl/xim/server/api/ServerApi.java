package com.xl.xim.server.api;


import com.xl.xim.server.api.vo.req.SendMsgReqVO;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
public interface ServerApi {

    /**
     * Push msg to client
     * @param sendMsgReqVO
     * @return
     * @throws Exception
     */
    Object sendMsg(SendMsgReqVO sendMsgReqVO) throws Exception;
}
