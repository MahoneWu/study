package com.mouse.autumn.basicioc.newaop.withinandtarget;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author wuhao Mahone Wu
 * @date 2018/7/29
 *
 * @Target是属于动态匹配，而@within属于静态匹配
 */
public class Runner {


    public static void main(String[] args) {

        AspectJProxyFactory weaver = new AspectJProxyFactory();

        weaver.setProxyTargetClass(true);

        weaver.setTarget(new Foo());

        weaver.addAspect(PointcutAspect.class);

        Object proxy = weaver.getProxy();

        ((com.mouse.autumn.basicioc.newaop.withinandtarget.Foo)proxy).method1();
        ((com.mouse.autumn.basicioc.newaop.withinandtarget.Foo)proxy).method2();



    }


}
