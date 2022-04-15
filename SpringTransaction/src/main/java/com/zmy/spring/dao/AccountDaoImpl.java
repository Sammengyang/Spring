package com.zmy.spring.dao;

import com.zmy.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 17:43
 */
@Repository
public class AccountDaoImpl implements AccountDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void addMoney() {
        String sql = "update account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"sam");
    }
    @Override
    public void redurceMoney() {
        String sql = "update account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"zmy");
    }


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
