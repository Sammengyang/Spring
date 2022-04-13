package com.zmy.spring;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-13 20:40
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
    @Override
    public String update(String id) {
        return id;
    }
}
