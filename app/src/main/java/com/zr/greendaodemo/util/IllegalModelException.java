package com.zr.greendaodemo.util;

/**
 * @author : yushiwo
 * @e-mail : zhengrui@otcbtc.com
 * @time : 2018/08/28
 * @desc :
 */
public class IllegalModelException extends RuntimeException {

    private static final long serialVersionUID = -8340903566440709502L;

    public IllegalModelException() {
    }

    public IllegalModelException(String detailMessage) {
        super(detailMessage);
    }

    public IllegalModelException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalModelException(Throwable cause) {
        super((cause == null ? null : cause.toString()), cause);
    }
}
