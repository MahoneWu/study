package com.mouse.test.clonedemo.three;

/**
 * Created by Mahone Wu on 2018/10/19.
 */
public class Student implements Cloneable {
    private int age;
    //定义为private说明这个成员变量只能被被当前类中访问，如果外部需要获得，那么就只能通过getAge方法进行获取
    private String name;
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }



}
