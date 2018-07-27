package com.mouse.autumn.basicioc.aop.advisor;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class Runner {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("aop/advisor/advisor-demo01.xml");

        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();

        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
        pointcut.setMappedName("sayHello");

        Advice advice = new AroundMethod();

        advisor.setPointcut(pointcut);
        advisor.setAdvice(advice);

    /*    ProxyFactory weaver  = new ProxyFactory();
        weaver.setTarget(new Print());
        weaver.addAdvisor(advisor);


        Object proxyObject = weaver.getProxy();
        ((Print) proxyObject).sayHello("world");
        ((Print) proxyObject).print();*/



        ProxyFactoryBean factoryBean=new ProxyFactoryBean();
        factoryBean.addAdvisor(advisor);
        factoryBean.setTarget(new Print());

        Print print = (Print) factoryBean.getObject();
        print.print();

        print.sayHello("123");





    }

}
