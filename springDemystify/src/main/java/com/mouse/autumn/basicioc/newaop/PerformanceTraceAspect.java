package com.mouse.autumn.basicioc.newaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Mahone Wu on 2018/7/28.
 */
@Aspect
public class PerformanceTraceAspect {


    @Pointcut("execution(public void *.method1()) || execution(public void *.method2())")
    public void pointcutName() {}

    public Object performanceTrace(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("name = " +joinPoint.getSignature().getName());
        return joinPoint.proceed();
    }


}
