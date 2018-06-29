package com.mouse.autumn.basicioc.factorybean.nonstatic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("factorybean/nonstatic/nonstaticfactorybean01.xml");
        Foo foo = (Foo) beanFactory.getBean("foo");
        foo.print();
    }

}
