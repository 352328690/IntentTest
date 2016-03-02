package com.example.intenttest;

import java.io.Serializable;

/**
 * Created by lenovo on 2016/3/2.
 */
public class Person1 implements Serializable{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


