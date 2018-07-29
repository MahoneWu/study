package com.mouse.autumn.basicioc.newaop.args;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author wuhao Mahone Wu
 * @date 2018/7/29
 *
 * https://blog.csdn.net/yangshangwei/article/details/77846974
 *
 */
@Aspect
public class PointcutAspect {


    @Pointcut("@args(com.mouse.autumn.basicioc.newaop.args.ArgsAnnotion)")
    public void pointcutName() {}


    @Around("pointcutName()")
    public Object performanceTrace(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("**PointcutAspect** " +joinPoint.getSignature().getName());
        return joinPoint.proceed();
    }

}
