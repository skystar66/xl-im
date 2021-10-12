package com.xl.xim.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Component
public class AppConfiguration {

    @Value("${xim.user.id}")
    private Long userId;

    @Value("${xim.user.userName}")
    private String userName;

    @Value("${xim.msg.logger.path}")
    private String msgLoggerPath;

    @Value("${xim.clear.route.request.url}")
    private String clearRouteUrl;

    @Value("${xim.heartbeat.time}")
    private long heartBeatTime;

    @Value("${xim.reconnect.count}")
    private int errorCount;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMsgLoggerPath() {
        return msgLoggerPath;
    }

    public void setMsgLoggerPath(String msgLoggerPath) {
        this.msgLoggerPath = msgLoggerPath;
    }


    public long getHeartBeatTime() {
        return heartBeatTime;
    }

    public void setHeartBeatTime(long heartBeatTime) {
        this.heartBeatTime = heartBeatTime;
    }


    public String getClearRouteUrl() {
        return clearRouteUrl;
    }

    public void setClearRouteUrl(String clearRouteUrl) {
        this.clearRouteUrl = clearRouteUrl;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
}
