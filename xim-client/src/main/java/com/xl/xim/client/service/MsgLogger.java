package com.xl.xim.client.service;
/**
*
* @author: xl
* @date: 2021/8/5
**/
public interface MsgLogger {

    /**
     * 异步写入消息
     * @param msg
     */
    void log(String msg) ;


    /**
     * 停止写入
     */
    void stop() ;

    /**
     * 查询聊天记录
     * @param key 关键字
     * @return
     */
    String query(String key) ;
}
