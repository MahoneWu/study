package com.mouse.test.clonedemo.one;

/**
 * Created by Mahone Wu on 2018/10/18.
 *
 * https://blog.csdn.net/qq_28081081/article/details/80455150
 */
public class Main {


    public static void main(String[] args) throws Exception {

        Teacher teacher3 = new Teacher();
        teacher3.setAge(60);
        teacher3.setName("Lao Wang");


        Student student3 = new Student();
        student3.setAge(22);
        student3.setName("Wu Hao");
        student3.setTeacher3(teacher3);

        Student copyStudent = (Student) student3.deepCopy();
        System.out.println(copyStudent.getName() + "---" + copyStudent.getTeacher3().getName());

        copyStudent.getTeacher3().setName("Mahone Wu");
        copyStudent.setName("123");
        copyStudent.getTeacher3().setAge(26);

        System.out.println("原始-"+student3.getTeacher3().getName() +" 改变后teacher name = " + copyStudent.getTeacher3().getName());
        System.out.println("原始-"+student3.getTeacher3().getAge()+" 改变后teacher age = " + copyStudent.getTeacher3().getAge());
        System.out.println("原始-"+student3.getName()+" 改变后 name = " + copyStudent.getName());

    }

}
