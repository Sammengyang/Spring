package com.zmy.spring.dao;

import com.zmy.spring.pojo.User;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 22:35
 */
public interface UserDao {
    /**
     * 添加用户
     * @param user
     */
    void add(User user);
}
