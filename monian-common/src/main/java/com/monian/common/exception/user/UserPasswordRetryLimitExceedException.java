package com.monian.common.exception.user;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/23 22:43.
 * 用户错误最大次数异常类
 */
public class UserPasswordRetryLimitExceedException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitExceedException(int retryLimitCount) {
        super("user.password.retry.limit.exceed", new Object[]{retryLimitCount});
    }
}