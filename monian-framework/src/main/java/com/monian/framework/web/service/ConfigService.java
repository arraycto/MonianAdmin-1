package com.monian.framework.web.service;

import com.monian.system.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/19 15:54
 * html调用 thymeleaf 实现参数管理
 */
@Service("config")
public class ConfigService {
    @Autowired
    private SysConfigService configService;

    /**
     * 根据键名查询参数配置信息
     *
     * @param configKey 参数键名
     * @return 参数键值
     */
    public String getKey(String configKey) {
        return configService.selectConfigByKey(configKey);
    }
}
