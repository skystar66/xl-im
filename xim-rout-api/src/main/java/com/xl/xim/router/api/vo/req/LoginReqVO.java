package com.xl.xim.router.api.vo.req;


import com.xl.xim.common.req.BaseRequest;

/**
 *
 * @author: xl
 * @date: 2021/8/5
 **/
public class LoginReqVO extends BaseRequest {
    private Long userId ;
    private String userName ;

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
        return "LoginReqVO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                "} " + super.toString();
    }
}
