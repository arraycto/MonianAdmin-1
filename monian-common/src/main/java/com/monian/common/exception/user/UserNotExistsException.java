package com.monian.common.exception.user;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/23 22:42
 * 用户不存在异常类
 */
public class UserNotExistsException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserNotExistsException() {
        super("user.not.exists", null);
    }
}
