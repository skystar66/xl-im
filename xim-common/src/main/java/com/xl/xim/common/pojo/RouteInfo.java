package com.xl.xim.common.pojo;

/**
*
* @author: xl
* @date: 2021/8/5
**/
public final class RouteInfo {

    private String ip ;
    private Integer ximServerPort;
    private Integer httpPort;

    public RouteInfo(String ip, Integer ximServerPort, Integer httpPort) {
        this.ip = ip;
        this.ximServerPort = ximServerPort;
        this.httpPort = httpPort;
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
