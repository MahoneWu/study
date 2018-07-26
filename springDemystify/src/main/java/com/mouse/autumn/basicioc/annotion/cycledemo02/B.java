package com.mouse.autumn.basicioc.annotion.cycledemo02;

/**
 * Created by Mahone Wu on 2018/7/23.
 */
public class B {

    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void printB(){
        a.sayHello();
        System.out.println("printB");
    }


}
