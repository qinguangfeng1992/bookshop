package com.hzit.controller;

import com.fc.platform.commons.page.Page;

import com.hzit.dao.vo.BookVo;
import com.hzit.service.BookQin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class BookContro extends BaseController{
    @Autowired
    private BookQin bookImpl;
/*    @Autowired
    private BookType typeImpl;*/


/*测试一下能不能 把JSON字符串 发送到页面上的 查询全部的方法*/
    @RequestMapping("/bookall")
    @ResponseBody
    public Object getBookList() {
        return bookImpl.findBookAll();

    }

    //首页
    @RequestMapping("/index")
    public String getBookIndex(@RequestParam(name = "page", defaultValue = "0") Integer page, ModelMap modelMap) {
        if (page < 0) page = 0;
        Page<BookVo> list = bookImpl.findPage(page,3);
        modelMap.put("list",list);
        modelMap.put("currpage", page);
        return "index";

    }



}
