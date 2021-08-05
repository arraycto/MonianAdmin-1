package com.monian.common.exception.user;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/23 22:42
 * 用户错误记数异常类
 */
public class UserPasswordRetryLimitCountException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitCountException(int retryLimitCount) {
        super("user.password.retry.limit.count", new Object[]{retryLimitCount});
    }
}