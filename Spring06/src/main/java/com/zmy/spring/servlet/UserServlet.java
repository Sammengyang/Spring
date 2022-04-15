package com.zmy.spring.servlet;

import com.zmy.spring.pojo.User;
import com.zmy.spring.service.UserService;
import com.zmy.spring.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 22:50
 */
public class UserServlet {
    static UserService userService = null;
    @Before
    public void before(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring06-config.xml");
        userService = context.getBean("userServiceImpl", UserServiceImpl.class);
    }

    @Test
    public void testJdbcTemplate(){

        User user = new User(50, "ss", "11");
        userService.updateUser(user);
        userService.deleteUser(user.getUid());
    }

    @Test
    public void testGetCount(){
        int count = userService.getCount();
        System.out.println("count = " + count);
    }

    @Test
    public void testGetUser(){
        User user = userService.getUser(3);
        System.out.println("user = " + user);
    }
    @Test
    public void testGetAllUser(){
        List<User> allUser = userService.getAllUser();
        allUser.forEach(user -> System.out.println("user = " + user));
    }
    @Test
    public void testBatchAdd(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{22,"sdf","1"});
        list.add(new Object[]{23,"sf","2"});
        list.add(new Object[]{24,"s","s"});
        userService.batchAdd(list);
    }
    @Test
    public void testBatchUpdate(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"sdf","sdf",22});
        list.add(new Object[]{"sdf","sdf",23});
        list.add(new Object[]{"sdf","sdf",24});
        userService.batchUpdate(list);
    }
    @Test
    public void testBatchDelete(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{22});
        list.add(new Object[]{23});
        list.add(new Object[]{24});
        userService.batchDelete(list);
    }

}
