package com.xl.xim.client.service;
/**
*
* @author: xl
* @date: 2021/8/5
**/
public interface EchoService {

    /**
     * echo msg to terminal
     * @param msg message
     * @param replace
     */
    void echo(String msg, Object... replace) ;
}
