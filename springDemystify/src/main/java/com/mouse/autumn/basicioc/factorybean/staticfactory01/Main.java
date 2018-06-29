package com.mouse.autumn.basicioc.factorybean.staticfactory01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Main
 * @Package com.mouse.autumn.basicioc.factorybean.staticfactory01
 * @Description: 静态工程
 * @author Mahone Wu
 * @date 2018/6/29 20:37
 * @version V1.0
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("factorybean/static/staticfactorybean01.xml");

        Foo foo = (Foo) beanFactory.getBean("foo");
        foo.print();
    }

}
