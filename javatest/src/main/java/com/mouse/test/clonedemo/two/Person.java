package com.mouse.test.clonedemo.two;

/**
 * Created by Mahone Wu on 2018/10/19.
 */
public class Person implements Cloneable  {

    private String name;

    private int age;

    private Dog dog;

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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅克隆
        Object object = super.clone();
        return object;

        //深克隆
        /*Person newPerson = (Person) super.clone();
        Dog dog = (Dog) newPerson.getDog().clone();
        newPerson.setDog(dog);
        return newPerson;*/



    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", dog=").append(dog);
        sb.append('}');
        return sb.toString();
    }
}
