package com.hzit.controller;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Order;
import com.hzit.dao.entity.Orderdetail;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.BookVoHou;
import com.hzit.service.BookQin;
import com.hzit.service.OrderDelHou;
import com.hzit.service.serviceImpl.OrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
@RequestMapping("/hou")
public class HouOrder {

    @Autowired
    OrderDelHou orderAll;
    @Autowired
    OrderDelHou orderImpl;
    @RequestMapping("/orderlist")
    public String all(@RequestParam(name = "bookid",defaultValue = "")String[] bookid,HttpSession session) {
        String userid = "1";//(String) request.getSession().getAttribute("userid");
        bookid=new String[]{"1","5","1"};

        List<Book> l=(List<Book>) session.getAttribute("book");
        if (!(l==null)){
            for (int i=0;i<l.size();i++){
                for (int j=0;j<bookid.length;j++) {
                    if (l.get(i).getBookid().equals(bookid[j])){

                    }
                }
            }
        }
        //循环添加订单入数据库
        for (int i=0;i<bookid.length;i++) {
            //添加订单
            orderAll.Allorder(bookid[i], userid);
        }
        //创建图书集
        List<Book> book=new ArrayList<Book>();
        //查询当前用户的图书订单
        List<Orderdetail> list=orderAll.Aorder(userid);
        //循环保存当前的用户 所有图书
        for (int i=0;i<list.size();i++) {
            Orderdetail o=list.get(i);
            Book b=orderAll.bookA(o.getBookid());
            book.add(i,b);
        }
        //保存带走
        session.setAttribute("book",book);
        return "redirect:/hou/totoorderlist";
    }

    @RequestMapping("/totoorderlist")
    public String toorderlist(ModelMap modelMap){
        return "shopping";
    }

    @RequestMapping("/shoppingcart")
    public String gouwu(@RequestParam(name = "bookid",defaultValue = "")String[] bookid,HttpSession session){
        User user=(User) session.getAttribute("user");//隐藏中
        String userid=user.getUserid();
        //String userid ="1";
        List<Orderdetail> orderdetail=orderAll.Aorder(userid);//查询用户订单
        //bookid=new String[]{"1","5","2"};
        if(orderdetail.size()==0){
            for (int i = 0; i <bookid.length ; i++) {
                orderAll.Allorder(bookid[i], userid);
            }
        }else {
            //添加数据
            for (int j = 0; j < orderdetail.size(); j++) {
               for (int i = j; i < bookid.length; i++) {
                    Boolean aBoolean = orderAll.userbookcart(bookid[i], userid);
                    if (aBoolean) {
                        Integer conut = Integer.valueOf(orderdetail.get(j).getNum());
                        conut = conut + 1;
                        orderAll.updateorder(conut.toString(), orderdetail.get(j).getOrderdatailid());
                        break;
                    } else {
                        orderAll.Allorder(bookid[i], userid);
                    }
                }
            }
        }
        //获取当前用户的订单
        List<BookVoHou> listbook = new ArrayList<BookVoHou>();
        List<Orderdetail> orderdetai=orderAll.Aorder(userid);//查询用户订单
        for (int i = 0; i <orderdetai.size() ; i++) {
            BookVoHou bookvo=new BookVoHou();
            Orderdetail order=orderdetai.get(i);
            Book book=orderAll.bookA(order.getBookid());
            bookvo.setBookstore(book.getBookstore());//库存
            bookvo.setBooktime(book.getBooktime());//时间
            bookvo.setBookname(book.getBookname());//名字
            bookvo.setBookprice(book.getBookprice());//价格
            bookvo.setBookauthor(book.getBookauthor());
            bookvo.setBookdelete(book.getBookdelete());
            bookvo.setBookid(book.getBookid());
            bookvo.setBooktypeid(book.getBooktypeid());
            bookvo.setBookurl(book.getBookurl());
            bookvo.setCount(order.getNum());
            listbook.add(i,bookvo);
        }
        session.setAttribute("bookvohou",listbook);

        return "redirect:/hou/totoorderlist";
    }

    @RequestMapping("/orderinr")
    public String del(@RequestParam("bookid")String  bookid,@RequestParam("num")Integer num,HttpSession session,@RequestParam("nums") String nums){
        User user=(User) session.getAttribute("user");//隐藏中
        String userid=user.getUserid();
        //String userid="1";
        //System.out.println("图片:"+bookid+"总价:"+num);
        orderImpl.inr(num,userid,bookid,"已付款",nums);
        return "redirect:../shopping-success.html";
    }

    @RequestMapping("/todel")
    @ResponseBody
    public Object deldange(@RequestParam("bookid")String  bookid,HttpSession session){
        User user=(User) session.getAttribute("user");//隐藏中
        String userid=user.getUserid();
        //String userid="1";
        List<BookVoHou> listbook=(List<BookVoHou>)session.getAttribute("bookvohou");
        for (int i=0;i<listbook.size();i++){
            if (listbook.get(i).getBookid().equals(bookid)){
                listbook.remove(i);
            }
        }
        session.setAttribute("bookvohou",listbook);
        Integer integer=orderAll.deleteOrder(userid,bookid);
        return integer;
    }

/**
 * 为分页服务的方法
 */

/*@RequestMapping("/oderspliter")
public String getBookIndex(@RequestParam(name = "page", defaultValue = "0") Integer page, ModelMap modelMap) {
    if (page < 0) page = 0;
    Page<Order> list = orderImpl.findPage(page, 3);
    modelMap.put("list",list);
    modelMap.put("currpage", page);
    return "orderlist";

}*/
}
