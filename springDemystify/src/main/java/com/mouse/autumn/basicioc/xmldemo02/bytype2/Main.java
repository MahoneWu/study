package com.mouse.autumn.basicioc.xmldemo02.bytype2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("xmldemo02/bytype/bytype2.xml");

        Foo foo = (Foo) context.getBean("foo");
        foo.print();
    }

}
