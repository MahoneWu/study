package com.mouse.autumn.basicioc.event.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/7/19.
 */
public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("event/applicationEvent.xml");
        MethodExecutionEventPublisher publisher = (MethodExecutionEventPublisher)context.getBean("evtPublisher");
        publisher.methodToMonitor();
    }
}
