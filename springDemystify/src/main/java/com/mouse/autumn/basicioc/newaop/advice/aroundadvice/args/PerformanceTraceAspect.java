package com.mouse.autumn.basicioc.newaop.advice.aroundadvice.args;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
@Aspect
public class PerformanceTraceAspect {


/*    @Around("execution(boolean *.execute(String , ..)) && args(name)")
    public Object performanceTrace(ProceedingJoinPoint joinPoint,String name ) throws Throwable {
        System.out.println("---" + name + "--");
        Object object = joinPoint.proceed();
        System.out.println("**performanceTrace** = " + object);
        return object;
    }*/

    @Around("execution(boolean *.execute(String , ..)) && args(name,msg)")
    public Object performanceTrace(ProceedingJoinPoint joinPoint,String name,String msg ) throws Throwable {
        System.out.println("---" + name + "--" + msg);
        Object object = joinPoint.proceed();
        System.out.println("**performanceTrace** = " + object);
        return object;
    }



}
