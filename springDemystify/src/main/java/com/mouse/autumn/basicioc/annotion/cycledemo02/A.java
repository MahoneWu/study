package com.mouse.autumn.basicioc.annotion.cycledemo02;

/**
 * Created by Mahone Wu on 2018/7/23.
 */
public class A {

    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public void sayHello(){
        System.out.println("sayHello");
    }

    public void printA(){
        b.printB();
        System.out.println("printA");
    }


}
