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
@ComponentScan({"com.fc","com.hzit.serviceAll","com.hzit.controllerAll"})
@MapperScan("com.hzit.dao.mapper")
public class Starter extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(Starter.class,args);
    }
}
