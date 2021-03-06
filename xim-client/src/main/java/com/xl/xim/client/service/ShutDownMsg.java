package com.xl.xim.client.service;

import org.springframework.stereotype.Component;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Component
public class ShutDownMsg {
    private boolean isCommand;

    /**
     * 置为用户主动退出状态
     */
    public void shutdown() {
        isCommand = true;
    }

    public boolean checkStatus() {
        return isCommand;
    }
}
