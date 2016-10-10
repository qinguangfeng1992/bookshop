package com.hzit.service.serviceImpl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Order;
import com.hzit.dao.mapper.OrderMapper;
import com.hzit.dao.vo.BookVVo;
import com.hzit.dao.vo.BookVo;
import com.hzit.dao.vo.OrderVVo;
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
    @Override
    public List<OrderVVo> orderOfuserid(String userid) {
        Map map=new HashMap();
        map.put("userid",userid);
        List<Order> orderList=orderMapper.searchOrderByParams(map);
        List<OrderVVo> orderVVoList=new ArrayList<OrderVVo>();
        for (Order order:orderList){
            OrderVVo orderVVo=new OrderVVo();
            List<BookVVo> booklist=new ArrayList<BookVVo>();
            String[] as = order.getBookid().split(",");
            for (int i = 0; i <as.length ; i++) {
                BookVVo book=orderDelHou.bookVVoA(as[i],userid);
                booklist.add(book);
            }
            orderVVo.setBookjihe(booklist);//拿到用户图片组
            orderVVo.setBookid(order.getBookid());//拿到id
            orderVVo.setOrderdelete(order.getOrderdelete());
            orderVVo.setUserid(order.getUserid());
            orderVVo.setOrderid(order.getOrderid());
            orderVVo.setOrderprice(order.getOrderprice());
            orderVVo.setOrderstatu(order.getOrderstatu());
            orderVVo.setOrdertime(order.getOrdertime());
            orderVVoList.add(orderVVo);
        }

        return orderVVoList;
    }

    @Override
    public Page<Order> findPage(String userid,int page, int rowcount) {
        Map map=new HashMap();
        map.put("userid",userid);
        PageRequest pg = new PageRequest(page, rowcount);
        Page<Order> data = orderMapper.searchOrderByParams(map, pg);
        return data;
    }
}
