package com.hzit.serviceAll;

import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Orderdetail;
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
     * 创建一张订单
     * @return
     */
    public Integer Allorder(String bookid, String userid);

    /**
     * 创建一张订单在修改一张订单 数量
     * @return
     */
    public Integer updateorder(String Num);

    /**
     * 查询当前用户的所有订单
     * @return
     */
    public List<Orderdetail> Aorder(String userid);

    /**
     * 查询单个图书
     * @param bookid
     * @return
     */
    public Book bookA(String bookid);
}
