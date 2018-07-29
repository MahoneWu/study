package com.mouse.autumn.basicioc.newaop.demo01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Mahone Wu on 2018/7/28.
 */
@Aspect
public class PerformanceTraceAspect {


    @Pointcut("execution(public void *.method1()) || execution(public void *.method2())")
    public void pointcutName() {}

    @Around("pointcutName()")
    public Object performanceTrace(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("**PerformanceTraceAspect** name =" +joinPoint.getSignature().getName());
        return joinPoint.proceed();
    }


}
