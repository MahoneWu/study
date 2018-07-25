package com.mouse.autumn.basicioc.aop.proxy.demo01;

/**
 * Created by Mahone Wu on 2018/7/25.
 */
public class SubjectImpl implements ISubject {


    @Override
    public String request() {
        System.out.println("Hello World!!!");
        return "Hello world!!!";
    }
}
