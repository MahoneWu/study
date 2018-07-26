package com.mouse.autumn.basicioc.annotion.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: Main
 * @Package com.mouse.autumn.basicioc.annotion.demo01
 * @Description: AutowiredAnnotationBeanPostProcessor 源码  https://www.cnblogs.com/lzeffort/p/7748611.html
 * @author Mahone Wu
 * @date 2018/7/20 18:19
 * @version V1.0
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("annotion/demo01/demo01.xml");

        FXNewsProvider provider = (FXNewsProvider) context.getBean("newsProvider");

        provider.getAndPersistener();


    }



}
