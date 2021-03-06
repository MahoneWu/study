package com.mouse.autumn.basicioc.xmldemo02.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("xmldemo02/bytype/bytype.xml");

        Foo foo = (Foo) context.getBean("foo");
        foo.print();
    }

}
