package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import com.hzit.dao.vo.BookVo;
import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Book;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface BookMapper {

	void insertBook(Book book);

	int deleteBookByBookid(String bookid);

	int updateBook(Book book);

	Page<BookVo> searchBookByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<BookVo> searchBookByParams(@Param("map") Map<String, String> map);


} 
