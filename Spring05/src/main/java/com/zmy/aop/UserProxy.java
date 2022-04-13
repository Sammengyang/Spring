package com.zmy.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-13 22:04
 */
// 增强类
@Component
@Aspect // 生成代理对象
@Order(3)
public class UserProxy {
    // 相同切入点抽取
    @Pointcut(value = "execution(* com.zmy.aop.User.add(..))")
    public void pointdemo(){

    }
    // Before前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("UserProxy....before.....");
    }
    // After后置通知（最终通知）
    @After(value = "execution(* com.zmy.aop.User.add())")
    public void after(){
        System.out.println("after........");
    }
    // 返回通知
    @AfterReturning(value = "execution(* com.zmy.aop.User.add())")
    public void afterReturning(){
        System.out.println("AfterReturning.......");
    }
    // 异常通知
    @AfterThrowing(value = "execution(* com.zmy.aop.User.add())")
    public void afterThrowing(){
        System.out.println("AfterThrowing.......");
    }
    // 环绕通知
    @Around(value = "execution(* com.zmy.aop.User.add())")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.......");
        // 被增强的方法
        proceedingJoinPoint.proceed();
//        int i = 10/0;
        System.out.println("环绕之后.......");
    }

}
