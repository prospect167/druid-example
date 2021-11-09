package com.prospect.druid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: ant
 * @Date: 2021/11/9 12:54 下午
 */
@SpringBootApplication
@MapperScan("com.prospect.druid.mapper")
public class DruidExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruidExampleApplication.class, args);
    }
}
