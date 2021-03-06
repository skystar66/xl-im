package com.xl.xim.router.api.vo.res;

import java.io.Serializable;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
public class RegisterInfoResVO implements Serializable{
    private Long userId ;
    private String userName ;

    public RegisterInfoResVO(Long userId, String userName) {
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
        return "RegisterInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
