package com.hzit.dao.mapper;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import com.hzit.dao.entity.Booknumber;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BooknumberMapper {

	void insertBooknumber(Booknumber booknumber);

	void deleteBooknumberById(String id);

	void updateBooknumber(Booknumber booknumber);

	Page<Booknumber> searchBooknumberByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Booknumber> searchBooknumberByParams(@Param("map") Map<String, String> map);

} 
