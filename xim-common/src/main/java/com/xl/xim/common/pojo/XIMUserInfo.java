package com.xl.xim.common.pojo;

/**
 * 用户信息
 *
 * @author: xl
 * @date: 2021/8/5
 **/

public class XIMUserInfo {
    private Long userId;
    private String userName;

    public XIMUserInfo(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

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

    @Override
    public String toString() {
        return "XIMUserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
