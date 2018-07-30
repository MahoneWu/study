package com.mouse.autumn.basicioc.newaop.advice.declare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Runner
 * @Package com.mouse.autumn.basicioc.newaop.advice.declare
 * @Description: Introduction属于per-instance类型的Advice,所以目标对象通常情况下应该设置为prototype
 * @author Mahone Wu
 * @date 2018/7/30 14:34
 * @version V1.0
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("newaop/declare/declare.xml");

        Object task1 = context.getBean("task");
        Object task2 = context.getBean("task");

        System.out.println(((ICounter) task1).count());
        System.out.println(((ICounter) task2).count());


    }

}
