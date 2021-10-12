package com.xl.xim.router.api;


import com.xl.xim.common.res.BaseResponse;
import com.xl.xim.router.api.vo.req.ChatReqVO;
import com.xl.xim.router.api.vo.req.LoginReqVO;
import com.xl.xim.router.api.vo.req.P2PReqVO;
import com.xl.xim.router.api.vo.req.RegisterInfoReqVO;
import com.xl.xim.router.api.vo.res.RegisterInfoResVO;

/**
 * RouteApi
 *
 * @author: xl
 * @date: 2021/8/5
 **/
public interface RouteApi {

    /**
     * group chat
     *
     * @param groupReqVO
     * @return
     * @throws Exception
     */
    Object groupRoute(ChatReqVO groupReqVO) throws Exception;

    /**
     * Point to point chat
     *
     * @param p2pRequest
     * @return
     * @throws Exception
     */
    Object p2pRoute(P2PReqVO p2pRequest) throws Exception;


    /**
     * Offline account
     *
     * @param groupReqVO
     * @return
     * @throws Exception
     */
    Object offLine(ChatReqVO groupReqVO) throws Exception;

    /**
     * Login account
     *
     * @param loginReqVO
     * @return
     * @throws Exception
     */
    Object login(LoginReqVO loginReqVO) throws Exception;

    /**
     * Register account
     *
     * @param registerInfoReqVO
     * @return
     * @throws Exception
     */
    BaseResponse<RegisterInfoResVO> registerAccount(RegisterInfoReqVO registerInfoReqVO) throws Exception;

    /**
     * Get all online users
     *
     * @return
     * @throws Exception
     */
    Object onlineUser() throws Exception;
}
