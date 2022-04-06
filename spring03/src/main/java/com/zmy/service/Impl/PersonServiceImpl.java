package com.zmy.service.Impl;

import com.zmy.dao.PersonDao;
import com.zmy.pojo.Person;
import com.zmy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 20:53
 */
@Repository
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void meet(Person person) {
            personDao.eat(person);
    }
}
