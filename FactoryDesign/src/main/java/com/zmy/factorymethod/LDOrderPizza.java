package com.zmy.factorymethod;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-01 17:53
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")){
            return new LDCheesePizza();
        }else if (orderType.equals("papper")){
            return new LDCheesePizza();
        }
        return null;
    }
}
