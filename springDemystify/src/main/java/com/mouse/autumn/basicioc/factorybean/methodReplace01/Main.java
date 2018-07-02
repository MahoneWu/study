package com.mouse.autumn.basicioc.factorybean.methodReplace01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuhao Mahone Wu
 * @date 2018/6/30
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("factorybean/methodreplace01/methodreplace01.xml");

        FXNewsProvider fxNewsProvider = (FXNewsProvider)container.getBean("djNewsProvider");

        fxNewsProvider.getAndPersistener();


    }


}
