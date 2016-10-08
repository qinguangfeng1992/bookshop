package com.hzit.controller;

import com.hzit.dao.entity.Order;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.OrderVVo;
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
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/toorderlist")
    public String findOrderList(ModelMap modelMap,HttpSession session){
        User user = (User) session.getAttribute("user");
        List<OrderVVo> orderVVoList=orderService.orderOfuserid("1");//查询数据
        modelMap.put("olist",orderVVoList);
        return "orderlist";

    }

}
