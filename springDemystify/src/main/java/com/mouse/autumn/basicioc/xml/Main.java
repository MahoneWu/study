package com.mouse.autumn.basicioc.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Calendar;

/**
 * Created by Mahone Wu on 2018/6/27.
 */
public class Main {

    public static void main(String[] args) {

//        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
//        BeanFactory container = bindViaXMLFile(beanRegistry);
//        FXNewsProvider newsProvider = (FXNewsProvider)container.getBean("djNewsProvider");
//        newsProvider.getAndPersistener();


        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");

        Calendar c = Calendar.getInstance();
        //c.add(Calendar.MONTH,1);
        c.add(Calendar.YEAR,1);
        System.out.println(format.format(c.getTime()));


    }

    private static BeanFactory bindViaXMLFile(BeanDefinitionRegistry beanRegistry) {
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanRegistry);
        reader.loadBeanDefinitions("classpath:/xml/spring-xml.xml");
        return (BeanFactory) beanRegistry;

    }


}
