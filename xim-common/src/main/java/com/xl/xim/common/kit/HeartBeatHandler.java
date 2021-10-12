package com.xl.xim.common.kit;

import io.netty.channel.ChannelHandlerContext;

/**
 *
 * @author: xl
 * @date: 2021/8/5
 **/

public interface HeartBeatHandler {

    /**
     * 处理心跳
     * @param ctx
     * @throws Exception
     */
    void process(ChannelHandlerContext ctx) throws Exception ;
}
