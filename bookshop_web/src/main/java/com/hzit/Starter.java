package com.hzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by Administrator on 2016/10/6.
 */
@SpringBootApplication
@MapperScan("com.hzit.dao.mapper")
@ComponentScan({"com.hzit.service","com.fc", "com.hzit.controller"})
public class Starter extends SpringBootServletInitializer{
    public Starter(){
        System.out.println("启动SpringApplication");
    }
    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}
