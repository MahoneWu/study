package com.mouse.autumn.basicioc.annotion.cycledemo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Main
 * @Package com.mouse.autumn.basicioc.annotion.cycledemo03
 * @Description: https://blog.csdn.net/u010644448/article/details/59108799
 * @author Mahone Wu
 * @date 2018/7/23 17:24
 * @version V1.0
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotion/cycledemo03/cycle.xml");

        StudentA a = (StudentA)context.getBean("studentA");
        System.out.println(a);
    }

}
