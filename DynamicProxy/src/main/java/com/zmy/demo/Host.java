package com.zmy.demo;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-05 14:31
 */
public class Host implements Rent{
    private String name;

    public Host(String name) {
        this.name = name;
    }
    @Override
    public void rent() {
        System.out.println(name + "房东租房子.....");
    }
}
