package com.monian.common.enums;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/23 22:03
 * 用户会话
 */
public enum OnlineStatus {
    /**
     * 用户状态
     */
    on_line("在线"), off_line("离线");

    private final String info;

    private OnlineStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
