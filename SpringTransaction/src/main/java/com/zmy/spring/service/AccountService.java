package com.zmy.spring.service;

import com.zmy.spring.dao.AccountDao;
import com.zmy.spring.dao.AccountDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 17:43
 */
@Service
//@Transactional(rollbackFor = NullPointerException.class,timeout = 5,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    // 转账
    public void accountMoney(){
        accountDao.addMoney();
        int i = 10/0;// 模拟异常
        accountDao.redurceMoney();
    }

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }
}


