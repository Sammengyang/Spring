package com.zmy.factorymethod;

import com.zmy.factory.CheesePizza;

import java.util.Scanner;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-01 17:40
 */
public abstract class OrderPizza {
    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;  // 披萨类型
        do {
            System.out.println("请输入选择类型> cheese  pepper");
            Scanner sc = new Scanner(System.in);
            orderType = sc.next();
            // 调用创建方法,由工厂子类实现
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("选择错误退出！");
            }
        }while (pizza!=null);
    }
    // 定义抽象方法，createPizza 让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);
}
