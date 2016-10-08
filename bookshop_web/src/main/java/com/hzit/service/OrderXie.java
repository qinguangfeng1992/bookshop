package com.hzit.service;

import com.hzit.dao.entity.Order;
import com.hzit.dao.vo.OrderVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
public interface OrderXie {
    public List<Order> findOrderAll();
}
