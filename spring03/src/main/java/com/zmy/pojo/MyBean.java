package com.zmy.pojo;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 23:09
 */
public class MyBean extends Person implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        return new Person("sam");
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
