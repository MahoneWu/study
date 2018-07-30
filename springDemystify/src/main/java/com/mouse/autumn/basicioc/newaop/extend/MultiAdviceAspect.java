package com.mouse.autumn.basicioc.newaop.extend;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
@Aspect
public class MultiAdviceAspect implements Ordered {

    @Pointcut("execution(boolean *.execute(String , ..))")
    public void taskExecution(){}


    @Before("taskExecution()")
    public void beforeone(){
        System.out.println("before one");
    }

    @Before("taskExecution()")
    public void beforetwo(){
        System.out.println("before two");
    }


    @AfterReturning("taskExecution()")
    public void afterReturningOne(){
        System.out.println("after returning one");
    }

    @AfterReturning("taskExecution()")
    public void afterReturningTwo(){
        System.out.println("after returning two");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
