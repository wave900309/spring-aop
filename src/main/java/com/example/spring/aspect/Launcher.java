package com.example.spring.aspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Yang, Haiqiang on 2018/05/16.
 */
@SpringBootApplication
@ComponentScan("com.example.spring")
@EnableAspectJAutoProxy(exposeProxy = true)
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class);
    }
}
