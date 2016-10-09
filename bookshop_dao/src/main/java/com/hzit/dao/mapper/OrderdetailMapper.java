package com.hzit.dao.mapper;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Orderdetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderdetailMapper {

	void insertOrderdetail(Orderdetail orderdetail);

	void deleteOrderdetailByOrderdatailid(String orderdatailid);

	void updateOrderdetail(Orderdetail orderdetail);

	Page<Orderdetail> searchOrderdetailByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Orderdetail> searchOrderdetailByParams(@Param("map") Map<String, String> map);

	void deleteOrderdetailByid(@Param("map") Map<String, String> map);
} 
