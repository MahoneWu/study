package com.mouse.autumn.basicioc.beanpostprocessor;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Mahone Wu on 2018/7/2.
 */
public class Main {

    public static void main(String[] args) {

        ConfigurableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanpostprocessor/beanpostprocessor.xml"));

        beanFactory.addBeanPostProcessor(new PasswordDecodePostProcesseor());

        DowJonesNewsListener djNewsListener = (DowJonesNewsListener)beanFactory.getBean("djNewsListener");

        System.out.println(djNewsListener.getEncodedPassword());

    }

}
