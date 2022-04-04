package com.zmy.java;


import com.zmy.java.entity.User;
import com.zmy.java.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 10:03
 */
public class TestTransfer {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        // 从容器中获取 userService实例
        UserService userService = (UserService) context.getBean("userService");
        userService.transfer(new User("tom",200),new User("sam",500));
    }
}
