package com.zmy.java.dao.impl;

import com.zmy.java.dao.UserDao;
import com.zmy.java.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 9:57
 */
@Repository
public class UserDaoImpl implements UserDao {
    /**
     *  余额增
     * @param user
     */
    @Override
    public void add(User user) {
        System.out.println(user.getName()+"余额增加....");
    }

    /**
     *  余额减少
     * @param user
     */
    @Override
    public void minus(User user) {
        System.out.println(user.getName()+"余额减少....");
    }
}
