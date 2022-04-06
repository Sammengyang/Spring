package com.zmy.pojo;

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
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Person() {
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
}
