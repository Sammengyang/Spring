package com.zmy.factory;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-01 16:01
 */
public class GreekPizza extends Pizze {
 @Override
    public void prepare() {
        System.out.println(name + "...准备");
    }
}
