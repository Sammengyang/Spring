package com.zmy.java;

import com.zmy.demo.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description 代理类，不知道代理哪个类的对象，所有定义为泛型
 * @create 2022-04-05 11:17
 */
public class MyInvocationHandler<T> implements InvocationHandler {
    // 被代理类的接口
    T target;
    public MyInvocationHandler(T target) {
        this.target = target;
    }

    /**.
     * @return 返回动态代理实例
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
                );
    }
    // 处理代理类实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MSG(method.getName());
        // 使用反射 调用方法
        Object result = method.invoke(target, args);
        return result;
    }

    public void MSG(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
