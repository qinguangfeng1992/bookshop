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
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class OrderController extends BaseController{
    @Autowired
    private OrderService orderService;

    @RequestMapping("/toorderlist")
    public String findOrderList(ModelMap modelMap,HttpSession session,@RequestParam(name="page",defaultValue = "0") Integer page){
        User user = (User) session.getAttribute("user");
        List<OrderVVo> orderVVoList=orderService.orderOfuserid(user.getUserid());//查询数据
        Integer integer=0;
        Integer add=4;
        Integer pages=0;
        if(orderVVoList.size()%4==0){
            integer=orderVVoList.size()/4;
        }
        else {
            Integer kl=orderVVoList.size()/4;
            integer=kl+1;
            if(page==kl)
             add=orderVVoList.size()%4;
        }
        if (page==0){}else{pages=page*4;}
        List<OrderVVo> listList=new LinkedList<OrderVVo>();
        for (int i=pages;i<pages+add;i++) {
            listList.add(orderVVoList.get(i));
        }
        modelMap.put("olist", listList);
        modelMap.put("zoopage",integer);
        modelMap.put("page",page);
        return "orderlist";

    }

}
