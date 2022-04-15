package com.zmy.spring.service;

import com.zmy.spring.dao.UserDao;
import com.zmy.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 22:35
 */
public interface UserService {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 修改
     * @param user
     */
    void updateUser(User user);

    void deleteUser(Integer uid);

    int getCount();

    /**
     * 根据id查信息
     * @param uid
     * @return
     */
    User getUser(Integer uid);

    /**
     * 获取所有对象
     * @return
     */
    List<User> getAllUser();

    /**
     * 批量添加
     */
    void batchAdd(List<Object[]> list);
    /**
     * 批量修改
     */
    void batchUpdate(List<Object[]> list);
    /**
     * 批量删除
     */
    void batchDelete(List<Object[]> list);

}
