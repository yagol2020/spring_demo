package com.example.yagolxyz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yagol
 */
@SpringBootApplication
@MapperScan("com.example.yagolxyz.mapper")
public class YagolxyzApplication {

    public static void main(String[] args) {
        SpringApplication.run(YagolxyzApplication.class, args);
    }

}
