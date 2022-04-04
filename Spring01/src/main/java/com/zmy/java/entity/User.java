package com.zmy.java.entity;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 9:59
 */
public class User {
    private String name;
    private Integer balance;

    public User(String name, Integer balance) {
        this.name = name;
        this.balance = balance;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
