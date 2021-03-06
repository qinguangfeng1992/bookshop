package com.hzit.service.serviceImpl;

import com.hzit.dao.entity.Order;
import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.OrderMapper;
import com.hzit.dao.mapper.UserMapper;
import com.hzit.service.Login;
import com.hzit.service.OrderXie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class LoginService implements Login{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(String username,String userpwd) {
        if (!username.equals("")) {
            Map m = new HashMap();
            m.put("username", username);
            m.put("userpwd", userpwd);
            List<User> list = userMapper.searchUserByParams(m);
            if (list.size() > 0) {
                return list.get(0);
            } else {
                return null;
            }
        }
        return null;
    }


   /* @Override
    public User findUser(String username,String userpwd) {
        User user=userMapper.findOneUser(username,userpwd);
        return user;
    }*/


    @Override
    public boolean insert(User user) {
        try{
            userMapper.insertUser(user);
            return true;
        }catch(Exception ex){
            return false;
        }

    }
}



