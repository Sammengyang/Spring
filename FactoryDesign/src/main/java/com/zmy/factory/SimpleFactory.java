package com.zmy.factory;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description  简单工厂类
 * @create 2022-04-01 16:31
 */
public class SimpleFactory {

    // 根据orderType创建实例
    public Pizze CreatePizza(String orderType){
        System.out.println("简单工厂");
        Pizze pizze = null;
        if ("greek".equals(orderType)){
            pizze = new CheesePizza();
            pizze.setName(orderType);
        }else if ("cheese".equals(orderType)) {
            pizze = new CheesePizza();
            pizze.setName(orderType);
        }
        return pizze;
    }
}
