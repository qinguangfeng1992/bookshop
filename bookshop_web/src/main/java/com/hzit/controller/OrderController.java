package com.hzit.controller;

import com.hzit.dao.entity.Order;
import com.hzit.service.serviceImpl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/toorderlist")
    public String findOrderList(ModelMap modelMap){
        List<Order> list=orderService.findOrderAll();
        modelMap.put("olist",list);
        return "orderlist";
    }

}
