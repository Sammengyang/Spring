package com.zmy.spring;

import com.zmy.spring.config.SpringConfig;
import com.zmy.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-13 15:56
 */
public class TestSpring {

    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("srping-config.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

    @Test
    public void testAnnoation(){
        // 加载配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
