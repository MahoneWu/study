package com.mouse.autumn.basicioc.newaop.schemaaop.aspect;

import org.aspectj.lang.JoinPoint;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
public class SchemaBasedAspect {

    public void before(JoinPoint joinPoint){
        System.out.println("before:" + joinPoint.getSignature().getName());
    }

    public void after(JoinPoint joinPoint){
        System.out.println("after:" + joinPoint.getSignature().getName());
    }

    public void afterReturning(JoinPoint joinPoint, Object returnVal) {
        System.out.println("after:" + joinPoint.getSignature().getName() +":"+returnVal);

    }



}
