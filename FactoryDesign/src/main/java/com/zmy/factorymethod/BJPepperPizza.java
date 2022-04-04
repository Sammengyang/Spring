package com.zmy.factorymethod;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-01 17:36
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨准备.....");
    }
}
