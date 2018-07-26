package com.mouse.autumn.basicioc.annotion.cycledemo03;

/**
 * Created by Mahone Wu on 2018/7/23.
 */
public class StudentC {


    private StudentA studentA;

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }

    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }

    public StudentC() {

    }



}
