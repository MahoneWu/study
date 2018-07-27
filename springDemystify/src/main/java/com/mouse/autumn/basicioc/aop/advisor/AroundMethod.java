package com.mouse.autumn.basicioc.aop.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class AroundMethod implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("method name : " + invocation.getMethod().getName());

        System.out.println("method args :" + invocation.getArguments());

        System.out.println("method before");


        Object result = invocation.proceed();

        System.out.println("method after");

        return result;
    }
}

