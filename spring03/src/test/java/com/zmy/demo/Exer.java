package com.zmy.demo;

import com.zmy.pojo.MyBean;
import com.zmy.pojo.MyBeanPost;
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
        Person person = context.getBean("person",Person.class);
        Person person1 = context.getBean("person",Person.class);
        System.out.println(person==person1);
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring03-config.xml");
        Person person = context.getBean("myBean",Person.class);
        System.out.println(person);
    }

    @Test
    public void testBean3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring03-config.xml");
        Person person = context.getBean("person",Person.class);
        System.out.println("4.  获取到bean实例对象"+person);
        // 手动销毁
        context.close();
    }

    @Test
    public void testBeanPost(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring03-config.xml");
        MyBeanPost myBeanPost = context.getBean("myBeanPost", MyBeanPost.class);
        System.out.println("4.  获取到bean实例对象"+myBeanPost);
        // 手动销毁
        context.close();
    }

}
