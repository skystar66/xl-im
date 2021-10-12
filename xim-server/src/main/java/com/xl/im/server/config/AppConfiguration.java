package com.xl.im.server.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
@Component
@Data
public class AppConfiguration {

    @Value("${app.zk.root}")
    private String zkRoot;

    @Value("${app.zk.addr}")
    private String zkAddr;

    @Value("${app.zk.switch}")
    private boolean zkSwitch;

    @Value("${xim.server.port}")
    private int ximServerPort;

    @Value("${xim.route.url}")
    private String routeUrl;

    public String getRouteUrl() {
        return routeUrl;
    }

    public void setRouteUrl(String routeUrl) {
        this.routeUrl = routeUrl;
    }

    @Value("${xim.heartbeat.time}")
    private long heartBeatTime;

    @Value("${app.zk.connect.timeout}")
    private int zkConnectTimeout;

}
