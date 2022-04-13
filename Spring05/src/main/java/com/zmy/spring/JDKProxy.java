package com.zmy.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-13 20:42
 */
public class JDKProxy {
    public static void main(String[] args) {
        // 实例化真实角色
        UserDaoImpl userDao = new UserDaoImpl();
        // 实例化代理类
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        // 获取动态代理实例
        UserDao proxy = (UserDao) userDaoProxy.getProxy();
        int add = proxy.add(1, 2);
        System.out.println("add = " + add);
    }
}
// 创建代理对象的代码
class UserDaoProxy<T> implements InvocationHandler{
    //  被代理接口
    T target;
    // 有参构造
    public UserDaoProxy(T target){
        this.target = target;
    }
    // 获取代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }
    // 增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println(method.getName()+"方法之前...");
        //被增强的方法
        Object invoke = method.invoke(target, args);
        System.out.println("invoke = " + invoke);
        // 方法之后
        System.out.println(method.getName()+"方法之后...");
        return invoke;
    }
}
