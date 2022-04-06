package com.zmy.java;

import com.zmy.demo.Host;
import com.zmy.demo.Rent;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-05 11:26
 */
public class TestProxy {

    @Test
    public void test1(){
        // 实例化学生
        Person sam = new Student("sam");
        // 实例化handler
        InvocationHandler handler = new MyInvocationHandler<Person>(sam);

        // 创建代理对象
        /**
         * ClassLoader loader,  被代理类的加载器
         * Class<?>[] interfaces, 被代理类的类型
         * InvocationHandler h,  handler的实例
         */
        Person stupROXY = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class[]{Person.class},
                handler
        );
        // 执行代理对象的 giveMoney
        // 执行代理对象的方法，会调用handler的invoke方法
        // invoke 方法利用反射动态窒息感sam的fangfa
        stupROXY.giveMoney();
    }
    @Test
    public void test2(){

        // 实例化Host对象  真实角色
        Host host = new Host("sam");

        // 实例化handler  代理角色
        InvocationHandler handler = new MyInvocationHandler<Rent>(host);

        // 创建代理对象
        Rent rent = (Rent) Proxy.newProxyInstance(
                Rent.class.getClassLoader(),
                new Class[]{Rent.class},
                handler
        );

        rent.rent();

    }
    @Test
    public void test3(){
        // 实例化真实角色
        Host host = new Host("zmy");
        // 实例化代理角色
        MyInvocationHandler handler = new MyInvocationHandler<Rent>(host);
        // 获取动态代理实例
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();
    }
}
