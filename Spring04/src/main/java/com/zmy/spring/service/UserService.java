package com.zmy.spring.service;

import com.zmy.spring.dao.UserDao;
import com.zmy.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-13 16:03
 */

/**
 * 注解里的value属性可以省略不屑，默认是类名，首字母小写
 * UserService  ---- userService
 */
@Service
public class UserService {

    @Value("abc")
    private String name;

//    @Autowired // 根据类型注入
//    @Qualifier(value = "userDaoImpl") // 根据名称注入
//    private UserDao userDao;

//    @Resource   // 根据类型注入
    @Resource(name = "userDaoImpl") // 根据名称注入
    private UserDao userDao;
    public void add(){
        userDao.add();
        System.out.println("UserService  add....."+name);
    }
}
