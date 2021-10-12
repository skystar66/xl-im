package com.xl.xim.router.api.vo.res;

import com.xl.xim.common.pojo.RouteInfo;

import java.io.Serializable;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
public class XIMServerResVO implements Serializable {

    private String ip;
    private Integer ximServerPort;
    private Integer httpPort;

    public XIMServerResVO(RouteInfo routeInfo) {
        this.ip = routeInfo.getIp();
        this.ximServerPort = routeInfo.getXimServerPort();
        this.httpPort = routeInfo.getHttpPort();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getXimServerPort() {
        return ximServerPort;
    }

    public void setXimServerPort(Integer ximServerPort) {
        this.ximServerPort = ximServerPort;
    }

    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }
}
