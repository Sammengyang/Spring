package com.zmy.factorymethod;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-01 17:50
 */
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")){
            return new BJCheesePizza();
        }else if (orderType.equals("papper")){
            return new BJPepperPizza();
        }
        return null;
    }
}
