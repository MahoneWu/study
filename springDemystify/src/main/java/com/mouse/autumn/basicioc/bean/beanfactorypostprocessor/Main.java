package com.mouse.autumn.basicioc.bean.beanfactorypostprocessor;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author wuhao Mahone Wu
 * @date 2018/6/30
 */
public class Main {


    public static void main(String[] args) {
        String url = "bean/beanfactorypostprocessor/beanfactorypostprocessor.xml";
        ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(url));

        //ConfigurableListableBeanFactory beanFactory1 = new ClassPathXmlApplicationContext(url);


        PropertyPlaceholderConfigurer propertyPostProcesser = new PropertyPlaceholderConfigurer();

        propertyPostProcesser.setLocation(new ClassPathResource(url));

        propertyPostProcesser.setBeanFactory(beanFactory);


    }

}
