package com.zmy.java.dao;

import com.zmy.java.entity.User;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 9:56
 */
public interface UserDao {
    /**
     *  余额增加
     * @param user
     */
    void add(User user);

    /**
     *   余额减少
     * @param user
     */
    void minus(User user);
}
