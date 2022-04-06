package com.zmy.java;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description 被代理类
 * @create 2022-04-05 11:15
 */
public class Student implements Person {

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name +"交班费......");
    }
}
