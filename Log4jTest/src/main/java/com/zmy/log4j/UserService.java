package com.zmy.log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 9:51
 */
@Service(value = "userService")
public class UserService {

    @Autowired
    private ServiceLog4j serviceLog4j;

    public void addUser(User user){

        System.out.println("正在添加账户...........");
    }
}
