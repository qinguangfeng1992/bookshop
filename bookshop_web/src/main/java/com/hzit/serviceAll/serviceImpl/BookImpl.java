package com.hzit.serviceAll.serviceImpl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.Book;
import com.hzit.dao.mapper.BookMapper;
import com.hzit.serviceAll.BookQin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class BookImpl implements BookQin {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findBookAll() {
        return bookMapper.searchBookByParams(null);
    }
    @Override
    public Page<Book> findPage(int page, int rowcount) {

        PageRequest pg = new PageRequest(page, rowcount);

        Page<Book> data = bookMapper.searchBookByParams(null, pg);

        return data;

    }
}
