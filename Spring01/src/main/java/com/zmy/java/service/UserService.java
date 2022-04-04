package com.zmy.java.service;


import com.zmy.java.entity.User;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 9:23
 */
public interface UserService {
    /**
     *  user 1 减少
     *  user 2 增加
     * @param user1
     * @param user2
     */
    void transfer(User user1,User user2);
}
