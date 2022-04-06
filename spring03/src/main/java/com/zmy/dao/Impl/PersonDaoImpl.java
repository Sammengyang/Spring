package com.zmy.dao.Impl;

import com.zmy.dao.PersonDao;
import com.zmy.pojo.Person;
import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 20:49
 */
@Repository
public class PersonDaoImpl implements PersonDao {

    @Override
    public void eat(Person person) {
        System.out.println("吃饭............");
    }
}
