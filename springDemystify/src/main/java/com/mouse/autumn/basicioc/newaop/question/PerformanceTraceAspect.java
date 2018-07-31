package com.mouse.autumn.basicioc.newaop.question;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Mahone Wu on 2018/7/31.
 */
@Aspect
public class PerformanceTraceAspect {


    @Pointcut("execution(public void *.method1())")
    public void method1(){}

    @Pointcut("execution(public void *.method2())")
    public void method2(){}


    @Pointcut("method1() || method2()")
    public void compositePointcut(){}


    @Around("compositePointcut()")
    public Object performanceTrace(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("----"+joinPoint.getSignature().getName());

        return joinPoint.proceed();
    }




}
