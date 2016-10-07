package com.hzit.controller;

import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Orderdetail;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.BookVoHou;
import com.hzit.service.BookQin;
import com.hzit.service.OrderDelHou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;
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
    public String toorderlist(){
        return "shopping";
    }
    @RequestMapping("/shoppingcart")
    public String gouwu(@RequestParam(name = "bookid",defaultValue = "")String[] bookid,HttpSession session){
        String userid = "1";
        List<Orderdetail> orderdetail=orderAll.Aorder(userid);//查询用户订单
        bookid=new String[]{"1","5"};
        //添加数据
        for (int i = 0; i <orderdetail.size() ; i++) {
            for (int j = 0; j <bookid.length ; j++) {
                if (orderdetail.get(i).getBookid().equals(bookid[j])){
                    Integer num=Integer.parseInt(orderdetail.get(i).getNum());
                    num+=1;
                    orderAll.updateorder(num.toString(),orderdetail.get(i).getOrderdatailid());
                }else{
                    orderAll.Allorder(bookid[j],userid);
                }
            }
        }

        //获取当前用户的订单
        List<BookVoHou> listbook=(List<BookVoHou>)session.getAttribute("bookvohou");
        if (listbook==null) {
            listbook = new ArrayList<BookVoHou>();
        }
        List<Orderdetail> orderdetai=orderAll.Aorder(userid);//查询用户订单
        BookVoHou bookvo=new BookVoHou();
        for (int i = 0; i <orderdetai.size() ; i++) {
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
            listbook.add(bookvo);

        }
        session.setAttribute("bookvohou",listbook);
        return "redirect:/hou/totoorderlist";
    }
}
