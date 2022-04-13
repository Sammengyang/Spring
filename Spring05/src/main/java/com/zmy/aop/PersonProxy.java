package com.zmy.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-13 23:07
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    // Before前置通知
    @Before(value = "execution(* com.zmy.aop.User.add())\"")
    public void before(){
        System.out.println("PersonProxy....before.....");
    }
}
