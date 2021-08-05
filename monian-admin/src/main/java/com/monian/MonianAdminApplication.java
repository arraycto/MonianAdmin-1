package com.monian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author DaIQiFenG
 * @Date 2021/8/5 21:44
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MonianAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonianAdminApplication.class, args);
        System.out.println(
                "　◆◆◆◆◆◆　　◆　　　　　　　　　◆　　\n" +
                        "　◆　　◆　◆　　◆◆　　　　　　　◆　◆　　　　　\n" +
                        "　◆◆　◆◆◆　　◆　◆　　　　　◆　　　◆　　　　\n" +
                        "　◆　　◆　◆　　◆　　　　　　◆　◆　　　◆　　　\n" +
                        "　◆◆◆◆◆◆　◆◆◆◆　　◆◆　　　◆　　　◆◆　\n" +
                        "　　　　◆　　　　◆　　　　　　◆◆◆◆◆◆　　　　\n" +
                        "　◆◆◆◆◆◆　　◆　　　　　　　　　　　◆　　　　\n" +
                        "　　　　◆　　　　◆　　　　　　　　　　◆　　　　　\n" +
                        "　　　　◆◆◆　◆　◆　　　　　　　　◆　　　◆　　\n" +
                        "　◆◆◆　　　　◆　◆　　　　◆　◆　　◆　　　◆　\n" +
                        "　　◆　◆　◆　◆　◆　　　　◆　◆　　　　◆　◆　\n" +
                        "　◆　◆　◆　◆　　　◆　　◆　　　◆◆◆◆◆　　　\n" +
                        "  MonianAdmin启动成功  (❁´◡`❁) ");
    }
}
