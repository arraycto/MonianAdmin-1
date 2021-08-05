package com.monian.common.exception.user;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/23 22:40
 * 用户锁定异常类
 */
public class UserBlockedException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserBlockedException() {
        super("user.blocked", null);
    }
}
