package com.mouse.autumn.basicioc.newaop.schemaaop.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class PerformanceMethodInterceptor implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("----");

        return invocation.proceed();
    }
}
