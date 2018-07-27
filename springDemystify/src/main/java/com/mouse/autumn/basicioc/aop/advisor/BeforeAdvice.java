package com.mouse.autumn.basicioc.aop.advisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class BeforeAdvice implements MethodBeforeAdvice {


    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println("before----------BeforeAdvice");

    }
}


