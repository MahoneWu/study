package com.mouse.autumn.basicioc.xmldemo01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/6/28.
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory container = new ClassPathXmlApplicationContext("classpath:/xmldemo01/xmldemo01.xml");

        MockBusinessObject mockBO = (MockBusinessObject)container.getBean("mockBO");
        System.out.println(mockBO.toString());
    }

}
