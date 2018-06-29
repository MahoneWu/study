package com.mouse.autumn.basicioc.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Created by Mahone Wu on 2018/6/27.
 */
public class Main {

    public static void main(String[] args) {

        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory container = bindViaXMLFile(beanRegistry);

        FXNewsProvider newsProvider = (FXNewsProvider)container.getBean("djNewsProvider");
        newsProvider.getAndPersistener();
    }

    private static BeanFactory bindViaXMLFile(BeanDefinitionRegistry beanRegistry) {

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanRegistry);

        reader.loadBeanDefinitions("classpath:/xml/spring-xml.xml");

        return (BeanFactory) beanRegistry;

    }


}
