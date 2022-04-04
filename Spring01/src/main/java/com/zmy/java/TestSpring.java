package com.zmy.java;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-02 11:31
 */
public class TestSpring {

    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        Object person = context.getBean("person");
        System.out.println("person = " + person.getClass().getName());
    }

}
