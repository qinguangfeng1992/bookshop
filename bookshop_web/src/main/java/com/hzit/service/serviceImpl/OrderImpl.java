package com.hzit.service.serviceImpl;

import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Orderdetail;
import com.hzit.dao.mapper.BookMapper;
import com.hzit.dao.mapper.OrderMapper;
import com.hzit.dao.mapper.OrderdetailMapper;
import com.hzit.service.OrderDelHou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
    public Integer deleteOrder(String id) {
       try {
           orderMapper.deleteOrderByOrderid(id);
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
    public Integer updateorder(String Num) {
        Orderdetail orderdetail=new Orderdetail();
        orderdetail.setNum(Num);
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
        Book b=new Book();
        map.put("bookid",bookid);
        List<Book> listbook=bookMapper.searchBookByParams(map);
        for (Book l:listbook) {
            b.setBookid(l.getBookid());
            b.setBookauthor(l.getBookauthor());
            b.setBookdelete(l.getBookdelete());
            b.setBookname(l.getBookname());
            b.setBookprice(l.getBookprice());
            b.setBookstore(l.getBookstore());
            b.setBooktime(l.getBooktime());
            b.setBooktypeid(l.getBooktypeid());
            b.setBookurl(l.getBookurl());
        }
        return b;
    }


}
