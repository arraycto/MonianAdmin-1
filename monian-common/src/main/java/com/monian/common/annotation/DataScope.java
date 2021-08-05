package com.monian.common.annotation;

import java.lang.annotation.*;

/**
 * @Author DaIQiFenG
 * @Date 2021/7/16 23:56
 * 数据权限过滤注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataScope {
    /**
     * 部门表的别名
     */
    public String deptAlias() default "";

    /**
     * 用户表的别名
     */
    public String userAlias() default "";
}
