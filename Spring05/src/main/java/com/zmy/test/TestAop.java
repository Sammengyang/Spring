package com.zmy.test;

import com.zmy.aop.User;
import com.zmy.config.CongifAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-13 22:40
 */
public class TestAop {

    @Test
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void testAopAllAop(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CongifAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
