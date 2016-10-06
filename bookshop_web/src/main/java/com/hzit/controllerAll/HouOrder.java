package com.hzit.controllerAll;

import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Orderdetail;
import com.hzit.serviceAll.BookQin;
import com.hzit.serviceAll.OrderDelHou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
@RequestMapping("/hou")
public class HouOrder {

    @Autowired
    OrderDelHou orderAll;
    @RequestMapping("/orderlist")
    public String all(@RequestParam(name = "bookid",defaultValue = "1")String bookid, ModelMap modelMap,HttpServletRequest request) {
        String userid = "1";//(String) request.getSession().getAttribute("userid");
        String boo = bookid;
        if (!boo.equals(bookid)){
            //添加订单
            orderAll.Allorder(bookid, userid);
        }
        //查询当前用户的图书订单
        List<Orderdetail> list=orderAll.Aorder(userid);
        //创建图书集
        List<Book> book=new ArrayList<Book>();
        //循环保存当前的用户 所有图书
        for (int i=0;i<list.size();i++) {
            Orderdetail o=list.get(i);
            Book b=orderAll.bookA(o.getBookid());
            book.add(i,b);
        }
        //保存带走
        modelMap.put("book",book);
        return "shopping";
    }
}
