package com.hzit.dao.mapper;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Order;
import com.hzit.dao.vo.OrderVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderMapper {

	void insertOrder(Order order);

	void deleteOrderByOrderid(String orderid);

	void updateOrder(Order order);

	Page<Order> searchOrderByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Order> searchOrderByParams(@Param("map") Map<String, String> map);



} 
