package com.mouse.autumn.basicioc.newaop.question;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @Title: Runner
 * @Package com.mouse.autumn.basicioc.newaop.question
 * @Description: PAGE 254
 * @author Mahone Wu
 * @date 2018/7/31 14:54
 * @version V1.0
 */
public class Runner {


    public static void main(String[] args) {
        AspectJProxyFactory weaver = new AspectJProxyFactory(new NestableInvocationBO());

        weaver.setProxyTargetClass(true);

        weaver.addAspect(PerformanceTraceAspect.class);

        weaver.setExposeProxy(true);


        Object proxy = weaver.getProxy();

        ((NestableInvocationBO)proxy).method1();
        //((NestableInvocationBO)proxy).method2();




    }



}
