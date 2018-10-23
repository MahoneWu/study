package com.mouse.test.clonedemo.two;

/**
 * Created by Mahone Wu on 2018/10/19.
 */
public class Dog implements Cloneable {

    private String type;

    private String color;

    private int age;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
