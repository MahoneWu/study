package com.mouse.autumn.basicioc.newaop.advice.afterreturningadvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
@Aspect
public class TaskExecutionCompletionAspect {


    @AfterReturning("execution(boolean *.execute(String,..))")
    public void taskExecutionCompleted(JoinPoint jp) {
        Class zz = jp.getTarget().getClass();
        System.out.println("=======执行成功的" + zz);

    }





}
