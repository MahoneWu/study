package com.mouse.test.clonedemo.four;

/**
 * Created by Mahone Wu on 2018/10/19.
 */
public class Main {
    public static void main(String[] args)throws Exception {
        Person person = new Person();
        person.setAge(22);
        person.setName("test-1");

        Dog dog = new Dog();
        dog.setAge(1);
        dog.setColor("黄色");
        dog.setType("x dog");

        person.setDog(dog);

        Person clonePerson = (Person) person.deepCopy();
        clonePerson.setAge(1);
        clonePerson.setName("new person");

        System.out.println(person);
        System.out.println(clonePerson);



    }

}
