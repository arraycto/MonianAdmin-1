package com.monian.common.exception.user;

import com.monian.common.exception.base.BaseException;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/23 22:39
 * 用户信息异常类
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}