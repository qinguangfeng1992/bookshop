package com.hzit.controllerAll;

import com.hzit.dao.entity.User;

import com.hzit.serviceAll.serviceImpl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/toindex")
    public String userLogin(@RequestParam("username")String username,@RequestParam("userpwd") String userpwd,HttpSession session){
        User user=loginService.findUser(username,userpwd);
//      System.out.println("1111111"+username+"11111111111");
        if(user!=null){
            System.out.println("222222222222222");
            session.setAttribute("user",user);
            return "index";
        }else{
            System.out.println("444444444444444");
            return "login";
        }
    }

    @RequestMapping("/register")
    public String register(User user){
        boolean in=loginService.insert(user);
        if(in){
            return "index";
        }else{
            return "login";
        }
    }


}
