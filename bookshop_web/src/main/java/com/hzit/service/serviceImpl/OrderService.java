package com.hzit.service.serviceImpl;

import com.hzit.dao.entity.Order;
import com.hzit.dao.mapper.OrderMapper;
import com.hzit.service.OrderXie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
@Service
public class OrderService implements OrderXie{
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Order> findOrderAll() {
        return orderMapper.searchOrderByParams(null);
    }
}
