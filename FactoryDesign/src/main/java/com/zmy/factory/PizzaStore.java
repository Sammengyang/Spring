package com.zmy.factory;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description pizza店，相当于客户端，订购pizza
 * @create 2022-04-01 16:13
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}
