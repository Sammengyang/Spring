package com.zmy.spring.dao;

import com.zmy.spring.pojo.User;

import java.util.List;

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

    /**
     * 根据id修改信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 通过id删除用户
     * @param uid
     */
    void deleteUser(Integer uid);

    /**
     * 统计表中记录数
     * @return
     */
    int getCount();

    /**
     * 根据id查信息
     * @param uid
     * @return
     */
    User getUser(Integer uid);

    /**
     * 获取所有用户
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
     * @param list
     */
    void batchDelete(List<Object[]> list);
}
