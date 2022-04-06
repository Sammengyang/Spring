package com.zmy.servlet;

import com.zmy.pojo.Person;
import com.zmy.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 20:52
 */
public class PersonServlet {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring03-config.xml");
        PersonService personService = (PersonService) context.getBean(PersonService.class);
        personService.meet(new Person("sam"));
    }
}
