package com.zmy.factory;

import java.util.Scanner;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-01 16:07
 */
public class OrderPizza {
    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    // 构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }
    public void setSimpleFactory(SimpleFactory simpleFactory) {
        Pizze pizze = null;
        do {
            System.out.println("输入pizza类型》");
            Scanner sc = new Scanner(System.in);
            String orderType = sc.next();
            this.simpleFactory = simpleFactory;
            // 调用工厂类创建方法
            pizze = this.simpleFactory.CreatePizza(orderType);
            if (pizze != null) {
                pizze.setName(orderType);
                pizze.prepare();
                pizze.bake();
                pizze.cut();
                pizze.box();
            }
        } while (pizze!=null);
    }
}
