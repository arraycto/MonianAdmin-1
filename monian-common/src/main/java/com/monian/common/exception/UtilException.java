package com.monian.common.exception;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/23 22:32
 * 工具类异常
 */
public class UtilException  extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public UtilException(Throwable e) {
        super(e.getMessage(), e);
    }

    public UtilException(String message) {
        super(message);
    }

    public UtilException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
