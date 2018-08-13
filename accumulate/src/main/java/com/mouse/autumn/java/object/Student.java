package com.mouse.autumn.java.object;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/11
 */
public class Student implements Cloneable {


    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
