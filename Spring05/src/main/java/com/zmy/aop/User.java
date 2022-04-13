package com.zmy.aop;

import org.springframework.stereotype.Component;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description 被增强类
 * @create 2022-04-13 22:03
 */
@Component
public class User {
    // 前置通知
    public void add(){
        System.out.println("add..... ");
    }
}
