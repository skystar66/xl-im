package com.xl.xim.client.service.impl;

import com.xl.xim.client.service.CustomMsgHandleListener;
import com.xl.xim.client.service.MsgLogger;
import com.xl.xim.client.util.SpringBeanFactory;


/**
 * 自定义收到消息回调
 * @author: xl
 * @date: 2021/8/5
 **/
public class MsgCallBackListener implements CustomMsgHandleListener {


    private MsgLogger msgLogger ;

    public MsgCallBackListener() {
        this.msgLogger = SpringBeanFactory.getBean(MsgLogger.class) ;
    }

    @Override
    public void handle(String msg) {
        msgLogger.log(msg) ;
    }
}
