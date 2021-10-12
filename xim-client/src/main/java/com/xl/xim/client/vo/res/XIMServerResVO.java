package com.xl.xim.client.vo.res;

import java.io.Serializable;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
public class XIMServerResVO implements Serializable {

    /**
     * code : 9000
     * message : 成功
     * reqNo : null
     * dataBody : {"ip":"127.0.0.1","port":8081}
     */

    private String code;
    private String message;
    private Object reqNo;
    private ServerInfo dataBody;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getReqNo() {
        return reqNo;
    }

    public void setReqNo(Object reqNo) {
        this.reqNo = reqNo;
    }

    public ServerInfo getDataBody() {
        return dataBody;
    }

    public void setDataBody(ServerInfo dataBody) {
        this.dataBody = dataBody;
    }

    public static class ServerInfo {
        /**
         * ip : 127.0.0.1
         * port : 8081
         */
        private String ip;
        private Integer ximServerPort;
        private Integer httpPort;

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

        @Override
        public String toString() {
            return "ServerInfo{" +
                    "ip='" + ip + '\'' +
                    ", ximServerPort=" + ximServerPort +
                    ", httpPort=" + httpPort +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "XIMServerResVO{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", reqNo=" + reqNo +
                ", dataBody=" + dataBody +
                '}';
    }
}
