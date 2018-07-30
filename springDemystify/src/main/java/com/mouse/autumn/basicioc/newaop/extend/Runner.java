package com.mouse.autumn.basicioc.newaop.extend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
public class Runner {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("newaop/extend/extend.xml");

        MultiMethod method = (MultiMethod) context.getBean("method");


        method.execute("wh");

    }




}
