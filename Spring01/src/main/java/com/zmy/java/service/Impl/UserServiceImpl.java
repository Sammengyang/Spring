package com.zmy.java.service.Impl;

import com.zmy.java.dao.UserDao;
import com.zmy.java.entity.User;
import com.zmy.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 9:22
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

//    public UserDao getUserDao() {
//        return userDao;
//    }
//
//    // 容器通过set方法实现对象的注入
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    public UserServiceImpl(UserDao userDao) {
//        System.out.println("有参构造函数被调用");
//        this.userDao = userDao;
//    }
//
//    public UserServiceImpl() {
//    }

    /** user1 给 user2转账
     *  user 1 减少
     *  user 2 增加
     * @param user1
     * @param user2
     */
    @Override
    public void transfer(User user1, User user2) {
        userDao.minus(user1);
        userDao.add(user2);
    }
}
