package com.zmy.spring.service;

import com.zmy.spring.dao.UserDao;
import com.zmy.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 22:35
 */
@Service
public class UserService {
    // 注入dao
    @Autowired
    private UserDao userDao;

    /**
     * 添加用户
     * @param user
     */
    public void addUser(User user){
        userDao.add(user);
    }
}
