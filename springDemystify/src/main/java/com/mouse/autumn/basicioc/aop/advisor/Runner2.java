package com.mouse.autumn.basicioc.aop.advisor;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class Runner2 {

    public static void main(String[] args) {

        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();

        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();

        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
        pointcut.setMappedName("sayHello");

        Advice advice = new AroundMethod();

        advisor.setPointcut(pointcut);
        advisor.setAdvice(advice);


        AbstractBeanDefinition definition =
                new RootBeanDefinition(advisor.getClass(), AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true);
        beanRegistry.registerBeanDefinition("advisor", definition);


        AbstractBeanDefinition printDefinition =
                new RootBeanDefinition(Print.class, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true);
        beanRegistry.registerBeanDefinition("print", printDefinition);


//        beanRegistry.registerSingleton(advice);


        Print print = (Print) beanRegistry.getBean("print");
        print.sayHello("world");

    }


}
