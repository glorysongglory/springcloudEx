package com.hi.webapp.bootstream.stream.entity;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: sodbvi
 * Date: 2019/4/9
 * Time: 10:32
 **/
public class Person {
    private int age;
    private String name;
    private Date birthday;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
