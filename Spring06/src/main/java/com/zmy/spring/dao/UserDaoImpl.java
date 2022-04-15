package com.zmy.spring.dao;

import com.zmy.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 22:35
 */
@Repository
public class UserDaoImpl implements UserDao{
    // 注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加用户
     * @param user
     */
    @Override
    public void add(User user) {
        String sql = "insert into user values(?,?,?)";
        int update = jdbcTemplate.update(sql, user.getUid(), user.getUname(), user.getUpassword());
        System.out.println("update = " + update);
    }
}
