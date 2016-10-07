package com.hzit.serviceAll;

import com.hzit.dao.entity.User;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface Login {
    public User findUser(String username, String userpwd);
    public boolean insert(User user);
}
