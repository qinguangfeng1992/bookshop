package com.hzit.service;

import com.hzit.dao.entity.Order;
import com.hzit.dao.vo.OrderVVo;
import com.hzit.dao.vo.OrderVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
public interface OrderXie {
    public List<Order> findOrderAll(String userid);

    /**
     * 查询当前用户的 订单
     * @param userid
     * @return
     */
    public List<OrderVVo> orderOfuserid(String userid);
}
