package com.mouse.autumn.basicioc.annotion.cycledemo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/7/23.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotion/cycledemo02/cycle.xml");

        A a = (A)context.getBean("a");
        a.printA();
    }


}
