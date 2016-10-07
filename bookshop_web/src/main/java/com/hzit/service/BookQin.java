package com.hzit.service;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.Book;
import com.hzit.dao.vo.BookVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface BookQin {
    public List<BookVo> findBookAll();

    public Page<BookVo> findPage(int page, int rowcount);
}
