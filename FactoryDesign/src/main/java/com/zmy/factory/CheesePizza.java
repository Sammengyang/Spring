package com.zmy.factory;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-01 15:59
 */
public class CheesePizza extends Pizze{
    @Override
    public void prepare() {
        System.out.println(name+"CheessPizza....准备.....");
    }
}
