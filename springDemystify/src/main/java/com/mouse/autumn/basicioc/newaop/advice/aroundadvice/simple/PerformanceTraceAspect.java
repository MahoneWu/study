package com.mouse.autumn.basicioc.newaop.advice.aroundadvice.simple;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
@Aspect
public class PerformanceTraceAspect {


    @Around("execution(boolean *.execute(String , ..))")
    public Object performanceTrace(ProceedingJoinPoint joinPoint ) throws Throwable {
        Object object = joinPoint.proceed();
        System.out.println("**performanceTrace** = " + object);
        return object;
    }




}
