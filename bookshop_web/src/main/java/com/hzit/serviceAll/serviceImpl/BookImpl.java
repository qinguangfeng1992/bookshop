package com.hzit.serviceAll.serviceImpl;

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
}
