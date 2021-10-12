package com.xl.xim.client.service;

/**
 * 自定义消息回调
 *
 * @author: xl
 * @date: 2021/8/5
 **/
public interface CustomMsgHandleListener {

    /**
     * 消息回调
     *
     * @param msg
     */
    void handle(String msg);
}
