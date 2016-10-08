package com.hzit.controller;

import com.hzit.dao.entity.Order;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.OrderVo;
import com.hzit.service.OrderDelHou;
import com.hzit.service.serviceImpl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class OrderController extends BaseController{
    @Autowired
    private OrderService orderService;

    @RequestMapping("/toorderlist")
    public String findOrderList(ModelMap modelMap,HttpSession session){
        User user = (User) session.getAttribute("user");
        List<Order> list=orderService.findOrderAll(user.getUserid());
        modelMap.put("olist",list);
        return "orderlist";

    }

}
