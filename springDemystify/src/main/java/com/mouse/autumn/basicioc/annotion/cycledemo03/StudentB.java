package com.mouse.autumn.basicioc.annotion.cycledemo03;

/**
 * Created by Mahone Wu on 2018/7/23.
 */
public class StudentB {

    private StudentC studentC;

    public void setStudentC(StudentC studentC) {
        this.studentC = studentC;
    }

    public StudentB(StudentC studentC) {
        this.studentC = studentC;
    }

    public StudentB() {

    }

    public void dy(){
        System.out.println("studentB----dy");
    }


}
