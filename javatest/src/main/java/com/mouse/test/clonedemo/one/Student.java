package com.mouse.test.clonedemo.one;

import java.io.*;

/**
 * Created by Mahone Wu on 2018/10/18.
 */
public class Student implements Serializable {

    private int age;

    private String name;

    private String address;

    private Teacher teacher3;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Teacher getTeacher3() {
        return teacher3;
    }

    public void setTeacher3(Teacher teacher3) {
        this.teacher3 = teacher3;
    }

    public Object deepCopy() throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
