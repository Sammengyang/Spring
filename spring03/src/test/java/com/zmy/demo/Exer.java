package com.zmy.demo;

import com.zmy.pojo.MyBean;
import com.zmy.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 20:48
 */
public class Exer {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring03-config.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring03-config.xml");
        Person person = (Person) context.getBean("myBean");
        System.out.println(person);
    }

}
