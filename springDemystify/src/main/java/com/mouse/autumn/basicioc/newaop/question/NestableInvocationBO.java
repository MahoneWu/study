package com.mouse.autumn.basicioc.newaop.question;

import org.springframework.aop.framework.AopContext;

/**
 * Created by Mahone Wu on 2018/7/31.
 */
public class NestableInvocationBO {


    private Object getInstance(){
        return AopContext.currentProxy();
    }


    public void method1(){
        //method2();
        ((NestableInvocationBO)getInstance()).method2();
        System.out.println("method1 executed");
    }


    public void method2(){
        System.out.println("method2 executed");
    }

}
