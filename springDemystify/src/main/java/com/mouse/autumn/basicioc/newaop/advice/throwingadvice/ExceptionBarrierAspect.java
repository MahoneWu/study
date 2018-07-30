package com.mouse.autumn.basicioc.newaop.advice.throwingadvice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
@Aspect
public class ExceptionBarrierAspect {


    @AfterThrowing(pointcut = "execution(boolean *.execute(String,..))",throwing = "e")
    public void afterThrowing(RuntimeException e){

        System.out.println("**ExceptionBarrierAspect**=" + e.getMessage());

    }


}
