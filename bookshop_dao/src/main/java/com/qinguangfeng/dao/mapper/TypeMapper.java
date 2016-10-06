package com.qinguangfeng.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.qinguangfeng.dao.entity.Type;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface TypeMapper {

	void insertType(Type type);

	void deleteTypeByBooktypeid(String booktypeid);

	void updateType(Type type);

	Page<Type> searchTypeByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Type> searchTypeByParams(@Param("map") Map<String, String> map);

} 
