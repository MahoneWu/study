package com.mouse.autumn.basicioc.newaop.advice.aroundadvice.args;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("newaop/advice/around-args.xml");

        AroundMethod method = (AroundMethod) context.getBean("aroundMethod");

        method.execute("hello", "world");
        //method.execute("hello");

    }


}
