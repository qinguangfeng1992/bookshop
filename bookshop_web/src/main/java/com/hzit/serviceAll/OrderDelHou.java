package com.hzit.serviceAll;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public interface OrderDelHou {
    /**
     * 删除
     * @param OrderId
     * @return
     */
    public Integer deleteOrder(String OrderId);

    /**
     * 查询全部总价
     * @return
     */
    public Integer Allorder(String bookid);

    /**
     * 查询全部总价
     * @return
     */
    public List<Order> Aorder();

}
