package com.hzit.service;

import com.hzit.dao.entity.Book;
import com.hzit.dao.entity.Orderdetail;
import com.hzit.dao.vo.BookVVo;
import com.hzit.dao.vo.BookVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public interface OrderDelHou {
    /**
     * 删除
     * @return
     */
    public Integer deleteOrder(String userid,String bookid);

    /**
     * 创建一张订单
     * @return
     */
    public Integer Allorder(String bookid, String userid);

    /**
     * 创建一张订单在修改一张订单 数量
     * @return
     */
    public Integer updateorder(String Num,String bookid);

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

    /**
     * 封装单个图书带数量
     * @param bookid
     * @return
     */
    public BookVVo bookVVoA(String bookid,String userid);
    /**
     * 查询用户订单中是否有此书籍
     */
    public Boolean userbookcart(String bookid,String userid);
    /**
     * 添加数据进入订单中
     */
    public Boolean inr(Integer num,String userid,String bookid,String orderstatu,String nums);
}
