package com.xl.xim.common.exception;


import com.xl.xim.common.enums.StatusEnum;

/**
 * @author: xl
 * @date: 2021/8/5
 **/
public class XIMException extends GenericException {


    public XIMException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public XIMException(Exception e, String errorCode, String errorMessage) {
        super(e, errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public XIMException(String message) {
        super(message);
        this.errorMessage = message;
    }

    public XIMException(StatusEnum statusEnum) {
        super(statusEnum.getMessage());
        this.errorMessage = statusEnum.message();
        this.errorCode = statusEnum.getCode();
    }

    public XIMException(StatusEnum statusEnum, String message) {
        super(message);
        this.errorMessage = message;
        this.errorCode = statusEnum.getCode();
    }

    public XIMException(Exception oriEx) {
        super(oriEx);
    }

    public XIMException(Throwable oriEx) {
        super(oriEx);
    }

    public XIMException(String message, Exception oriEx) {
        super(message, oriEx);
        this.errorMessage = message;
    }

    public XIMException(String message, Throwable oriEx) {
        super(message, oriEx);
        this.errorMessage = message;
    }


    public static boolean isResetByPeer(String msg) {
        if ("Connection reset by peer".equals(msg)) {
            return true;
        }
        return false;
    }

}
