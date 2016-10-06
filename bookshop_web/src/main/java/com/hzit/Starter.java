package com.hzit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2016/10/6.
 */

@SpringBootApplication
@Controller
@MapperScan("com.hzit.dao.mapper")
@ComponentScan({"com.hzit.serviceAll","com.fc","com.hzit.controllerAll"})
public class Starter extends SpringBootServletInitializer {
}
