package com.hzit.service.serviceImpl;

import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Order;
import com.hzit.dao.entity.Orderdetail;
import com.hzit.dao.mapper.BookMapper;
import com.hzit.dao.mapper.OrderMapper;
import com.hzit.dao.mapper.OrderdetailMapper;
import com.hzit.dao.vo.BookVo;
import com.hzit.service.OrderDelHou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class OrderImpl implements OrderDelHou {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    BookMapper bookMapper;
    @Autowired
    OrderdetailMapper orderdetailMapper;
    @Override
    public Integer deleteOrder(String userid,String bookid) {
        try {
        Map map=new HashMap();
        map.put("userid",userid);
        map.put("bookid",bookid);
        orderdetailMapper.deleteOrderdetailByid(map);
        return 1;
       }catch (Exception ex){
           ex.printStackTrace();
        return -1;
       }
    }

    @Override
    public Integer Allorder(String bookid, String userid) {
        try {
            Orderdetail orderdetail=new Orderdetail();//创建一个订单
            orderdetail.setBookid(bookid);//放入书籍id
            orderdetail.setOrderdatailid(UUID.randomUUID().toString());//放入订单编号
            orderdetail.setUserid(userid);
            orderdetail.setNum("1");
            orderdetailMapper.insertOrderdetail(orderdetail);
            return 1;
        }catch (Exception ex){
            ex.printStackTrace();
            return -1;
        }
    }
    //暂时为空
    @Override
    public Integer updateorder(String Num,String bookid) {
        Orderdetail orderdetail=new Orderdetail();
        orderdetail.setNum(Num);
        orderdetail.setOrderdatailid(bookid);
        orderdetailMapper.updateOrderdetail(orderdetail);
        return 1;
    }

    @Override
    public List<Orderdetail> Aorder(String userid) {
        Map map=new HashMap();
        map.put("userid",userid);
        return orderdetailMapper.searchOrderdetailByParams(map);
    }
    @Override
    public Book bookA(String bookid){
        Map map=new HashMap();
        map.put("bookid",bookid);
        List<Book> listbook=bookMapper.searchBookByParams(map);
        return listbook.get(0);
    }

    @Override
    public Boolean userbookcart(String bookid,String userid) {
        Map map=new HashMap();
        map.put("bookid",bookid);
        map.put("userid",userid);
        List<Orderdetail> orderdetailList=orderdetailMapper.searchOrderdetailByParams(map);
        if (orderdetailList.size()==0)
            return false;
        else
            return true;
    }
    @Override
    public Boolean inr(Integer num,String userid,String bookid,String orderstatu){
        Order order=new Order();
        order.setBookid(bookid);
        order.setOrderid(String.valueOf(System.currentTimeMillis()));//id
        order.setOrderprice(num);//总价
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        order.setOrdertime(format.format(new Date()));//日期
        order.setUserid(userid);
        order.setOrderstatu(orderstatu);
        order.setOrderdelete("1");
        orderMapper.insertOrder(order);
        return false;
    }

}
