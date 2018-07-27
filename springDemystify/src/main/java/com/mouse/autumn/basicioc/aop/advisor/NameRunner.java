package com.mouse.autumn.basicioc.aop.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: NameRunner
 * @Package com.mouse.autumn.basicioc.aop.advisor
 * @Description: https://www.cnblogs.com/xing901022/p/4143696.html    http://www.cnblogs.com/leiOOlei/p/3557643.html
 * @author Mahone Wu
 * @date 2018/7/27 15:15
 * @version V1.0
 */
public class NameRunner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/advisor/name-advisor-demo01.xml");
        /*Print print = (Print) context.getBean("print");
        print.sayHello("123");
        print.print();*/

        //ProxyFactoryBean proxyFactory = (ProxyFactoryBean)context.getBean("proxyFactory");
        //注意这里需要获取代理对象bean
        Print print = (Print) context.getBean("proxyFactory");
        print.sayHello("123");
        print.print();


    }

}
