package com.mouse.test.clonedemo.one;

import java.io.Serializable;

/**
 * Created by Mahone Wu on 2018/10/18.
 */
public class Teacher implements Serializable {


    private int age;

    private String name;

    private String gender;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
