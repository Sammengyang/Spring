package com.zmy.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 20:54
 */
public class Person {

    private String name;

    private String[] courses;

    private List<String> list;

    private Map<String,String> map;

    private Set set;


    public void setSet(Set set) {
        this.set = set;
    }

    public void setCourses(String[] courses) {
        System.out.println("2.  设置属性的值");
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Person() {
        System.out.println("1.  执行无参构造，创建bean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    // 创建初始化方法
    public void initMethod(){
        System.out.println("3.  执行初始化方法");
    }
    // 销毁的方法
    public void destoryMethod(){
        System.out.println("5.  执行销毁方法");
    }
}
