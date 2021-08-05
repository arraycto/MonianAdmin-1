package com.monian.common.exception.user;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/23 22:39
 * 验证码错误异常类
 */
public class CaptchaException extends UserException {
    private static final long serialVersionUID = 1L;

    public CaptchaException() {
        super("user.jcaptcha.error", null);
    }
}
