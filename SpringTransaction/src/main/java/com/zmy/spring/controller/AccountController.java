package com.zmy.spring.controller;

import com.zmy.spring.config.TxConfig;
import com.zmy.spring.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 18:03
 */
@Controller
public class AccountController {
    private AccountService accountService =null;
    public void getService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        accountService = context.getBean("accountService",AccountService.class);
        System.out.println("context = " + context);
        System.out.println("accountService = " + accountService);
    }
    @Test
    public void testAccount(){
        accountService.accountMoney();
    }

    @Before
    public void getService2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);accountService = context.getBean("accountService",AccountService.class);
        System.out.println("context = " + context);
        System.out.println("accountService = " + accountService);
    }
    @Test
    public void testAccount2(){
        accountService.accountMoney();
    }


}
