package com.mouse.autumn.basicioc.newaop.advice.afterreturningadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("newaop/advice/afterreturning.xml");

        ReturnMethod method = (ReturnMethod) context.getBean("exceptionMethod");

        method.execute("hello", "world");
    }

}
