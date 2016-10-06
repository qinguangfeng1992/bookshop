package com.hzit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by Administrator on 2016/10/6.
 */
@SpringBootApplication
public class Starter extends SpringBootServletInitializer{
    public Starter(){
        System.out.println("启动SpringApplication");
    }
    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}
