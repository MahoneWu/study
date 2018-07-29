package com.mouse.autumn.basicioc.newaop.demo01;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author wuhao Mahone Wu
 * @date 2018/7/28
 */
public class Runner {


    public static void main(String[] args) {

        AspectJProxyFactory weaver = new AspectJProxyFactory();

        weaver.setProxyTargetClass(true);

        weaver.setTarget(new Foo());

        weaver.addAspect(PerformanceTraceAspect.class);

        Object proxy = weaver.getProxy();

        ((Foo)proxy).method1();
        ((Foo)proxy).method2();



    }


}
