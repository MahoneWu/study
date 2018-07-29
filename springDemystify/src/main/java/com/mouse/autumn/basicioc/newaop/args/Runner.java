package com.mouse.autumn.basicioc.newaop.args;

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

        weaver.setTarget(new Print());

        weaver.addAspect(PointcutAspect.class);

        Object proxy = weaver.getProxy();

        ((Print)proxy).print(new Foo3());



//        AspectJProxyFactory weaver2 = new AspectJProxyFactory();
//
//        weaver2.setProxyTargetClass(true);
//
//        weaver2.setTarget(new Foo2());
//
//        weaver2.addAspect(PointcutAspect.class);
//
//        Object proxy2 = weaver2.getProxy();
//
//        ((Foo2)proxy2).method1();
//        ((Foo2)proxy2).method2();


    }


}
