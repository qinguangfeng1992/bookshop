package com.hzit.serviceAll.serviceImpl;

import com.hzit.dao.entity.Book;
import com.hzit.dao.mapper.BookMapper;
import com.hzit.serviceAll.OrderDelHou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class OrderImpl implements OrderDelHou {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    BookMapper bookMapper;
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
    public Integer Allorder(String bookid) {
        Map map=new HashMap<String, String>();
        map.put("bookid",bookid);
        List<Book> bookList = bookMapper.searchBookByParams(map);


        return null;
    }

    @Override
    public List<Order> Aorder() {
        return null;
    }

}
