package com.mouse.autumn.basicioc.newaop.extend;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
@Aspect
public class AnotherAspect implements Ordered {


    @Before("com.mouse.autumn.basicioc.newaop.extend.MultiAdviceAspect.taskExecution()")
    public void doBefor(){
        System.out.println("before in AnotherAspect");
    }


    @Override
    public int getOrder() {
        return 0;
    }
}
