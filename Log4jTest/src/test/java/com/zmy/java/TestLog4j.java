package com.zmy.java;

import com.zmy.log4j.ServiceLog4j;
import com.zmy.log4j.User;
import com.zmy.log4j.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 9:41
 */
public class TestLog4j {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser(new User());
    }
}
