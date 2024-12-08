package com.spring.noopsycheanswer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: noopsyche-answer
 * @author: spring
 * @create: 2024-12-09
 */
@SpringBootApplication
@MapperScan("com.spring.noopsycheanswer.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class NoopsycheAnswerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoopsycheAnswerApplication.class, args);
    }


}
