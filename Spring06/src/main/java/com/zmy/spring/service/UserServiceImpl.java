package com.zmy.spring.service;

import com.zmy.spring.dao.UserDao;
import com.zmy.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 16:01
 */
@Service
public class UserServiceImpl implements UserService{

    // 注入dao
    @Autowired
    private UserDao userDao;

    /**
     * 添加用户
     * @param user
     */
    @Override
    public void addUser(User user){
        userDao.add(user);
    }

    /**
     * 修改
     * @param user
     */
    @Override
    public void updateUser(User user){
        userDao.updateUser(user);
    }
    @Override
    public void deleteUser(Integer uid){
        userDao.deleteUser(uid);
    }
    @Override
    public int getCount(){
        return userDao.getCount();
    }

    @Override
    public User getUser(Integer uid) {
        return userDao.getUser(uid);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public void batchAdd(List<Object[]> list) {
        userDao.batchAdd(list);
    }

    @Override
    public void batchUpdate(List<Object[]> list) {
        userDao.batchUpdate(list);
    }
    /**
     * 批量删除
     */
    @Override
    public void batchDelete(List<Object[]> list) {
        userDao.batchDelete(list);
    }


}
