package com.hzit.controller;

import com.hzit.dao.entity.User;
import com.hzit.service.serviceImpl.LoginService;
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
        if(user!=null){
            session.setAttribute("user",user);
            return "redirect:/bookindex";
        }else{
            return "redirect:/login.html";
        }
    }
    @RequestMapping("/logout")
    public String userLogin(HttpSession session){
        session.invalidate();
        return "redirect:/login.html";
    }

    @RequestMapping("/zhuce")
    public String register(User user){
        boolean in=loginService.insert(user);
        if(in){
            return "redirect:/register_success.html";
        }else{
            return "redirect:/login.html";
        }
    }


}
