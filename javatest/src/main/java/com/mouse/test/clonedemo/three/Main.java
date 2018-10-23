package com.mouse.test.clonedemo.three;

/**
 * Created by Mahone Wu on 2018/10/19.
 */
public class Main {

    public static void main(String[] args) throws Exception {


        Student student = new Student();
        student.setAge(24);
        student.setName("niesong");
        Student student2 = (Student)student.clone();
        //这个是调用下面的那个方法，然后把这个这个对象Clone到student
        System.out.println("Age:" + student2.getAge() + " " + "Name:" + student2.getName());

        System.out.println("---------------------");
        student2.setAge(23);
        student2.setName("fgsdsa");
        //克隆后得到的是一个新的对象，所以重新写的是student2这个对象的值

        System.out.println(student.getAge());
        System.out.println(student2.getAge());

        System.out.println("old" + student.getName() + "----->" + student2.getName());


    }


}
