package com.hzit.controllerAll;

import com.hzit.serviceAll.OrderDelHou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
@RequestMapping("/hou")
public class HouOrder {

    @Autowired
    OrderDelHou orderAll;
    @RequestMapping("/orderlist")
    public String all(){
        return "orderlist";
    }
}
