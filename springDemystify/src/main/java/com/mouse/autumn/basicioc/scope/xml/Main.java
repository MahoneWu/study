package com.mouse.autumn.basicioc.scope.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Title: Main
 * @Package com.mouse.autumn.basicioc.scope
 * @Description: https://blog.csdn.net/elim168/article/details/75581670
 * @author Mahone Wu
 * @date 2018/6/29 15:40
 * @version V1.0
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("classpath:scope/xml/scope.xml");
        Foo foo1 = (Foo) context.getBean("foo");
        System.out.println(foo1+"---"+foo1.getBar());
        Foo foo2 = (Foo) context.getBean("foo");
        System.out.println(foo2+"---"+foo2.getBar());
    }
}
