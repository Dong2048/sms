package com.zagt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description 启动类
 * @Author dong
 * @Date 2024/4/9
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.zagt.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


