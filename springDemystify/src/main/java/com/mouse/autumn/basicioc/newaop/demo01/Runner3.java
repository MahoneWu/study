package com.mouse.autumn.basicioc.newaop.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuhao Mahone Wu
 * @date 2018/7/29
 */
public class Runner3 {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("newaop/auto2.xml");

        Foo foo = (Foo) context.getBean("target");

        foo.method1();
        foo.method2();

    }

}
