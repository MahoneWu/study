package com.mouse.autumn.basicioc.newaop.schemaaop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class Runner {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("newaop/schema/aspect.xml");

        ITask task = (ITask) context.getBean("task");
        //MockTask task = (MockTask) context.getBean("task");
        task.execute();
        //task.execute("hello");

    }



}
