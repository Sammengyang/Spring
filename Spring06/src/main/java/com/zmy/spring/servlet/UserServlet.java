package com.zmy.spring.servlet;

import com.zmy.spring.pojo.User;
import com.zmy.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 22:50
 */
public class UserServlet {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring06-config.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser(new User(50,"s","1"));
    }
}
