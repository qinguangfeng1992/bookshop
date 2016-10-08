package com.hzit.service.serviceImpl;

import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Order;
import com.hzit.dao.mapper.OrderMapper;
import com.hzit.dao.vo.OrderVo;
import com.hzit.service.OrderDelHou;
import com.hzit.service.OrderXie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/7.
 */
@Service
public class OrderService implements OrderXie {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    OrderDelHou orderDelHou;
    @Override
    public List<Order> findOrderAll(String userid) {
        Map map=new HashMap();
        map.put("userid",userid);
        return orderMapper.searchOrderByParams(map);
    }

    public List<OrderVo> orderOfuserid(String userid) {
        Map map=new HashMap();
        map.put("userid",userid);
        List<Order> orderList=orderMapper.searchOrderByParams(map);
        OrderVo orderVo=new OrderVo();
        List<Book> books=new ArrayList<Book>();//创建一个book集合
        for (Order order:orderList){
            Book book=orderDelHou.bookA(order.getBookid());
            books.add(book);
        }
        for (Book b:books){
           orderVo.setPictureurl(b.getBookurl());
        }
        return null;
    }
}
