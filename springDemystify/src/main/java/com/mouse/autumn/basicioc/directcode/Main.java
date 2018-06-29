package com.mouse.autumn.basicioc.directcode;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Created by Mahone Wu on 2018/6/27.
 */
public class Main {

    public static void main(String[] args) {

        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory container = bindViaCode(beanRegistry);
        FXNewsProvider newsProvider = (FXNewsProvider)container.getBean("djNewsProvider");
        newsProvider.getAndPersistener();
    }

    private static BeanFactory bindViaCode(BeanDefinitionRegistry beanRegistry) {
        AbstractBeanDefinition newsProvider =
                new RootBeanDefinition(FXNewsProvider.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true);

        AbstractBeanDefinition newsListener =
                new RootBeanDefinition(DowJonesNewsListener.class, AutowireCapableBeanFactory.AUTOWIRE_BY_NAME, true);

        AbstractBeanDefinition newsPersister =
                new RootBeanDefinition(DowJonesNewsPersister.class, AutowireCapableBeanFactory.AUTOWIRE_BY_NAME, true);


        //将bean注册到容器
        beanRegistry.registerBeanDefinition("djNewsProvider", newsProvider);
        beanRegistry.registerBeanDefinition("djNewsListener", newsListener);
        beanRegistry.registerBeanDefinition("djNewsPersister", newsPersister);


        //通过构造方法注入
        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
        argumentValues.addIndexedArgumentValue(0, newsListener);
        argumentValues.addIndexedArgumentValue(1, newsPersister);
        newsProvider.setConstructorArgumentValues(argumentValues);

        //通过setter方法注入方式
//        MutablePropertyValues propertyValues = new MutablePropertyValues();
//        propertyValues.addPropertyValue(new PropertyValue("newsListener", newsListener));
//        propertyValues.addPropertyValue(new PropertyValue("newsPersister", newsPersister));
//        newsProvider.setPropertyValues(propertyValues);
        return (BeanFactory)beanRegistry;
    }

}
