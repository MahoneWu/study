package com.mouse.autumn.basicioc.event.demo02;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by Mahone Wu on 2018/7/19.
 */
public class MethodExecutionEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;



    public void methodToMonitor(){
        MethodExecutionEvent beginEvent = new MethodExecutionEvent(this, "methodToMonitor", MethodExecutionStatus.BEGIN);
        this.publisher.publishEvent(beginEvent);


        MethodExecutionEvent endEvent = new MethodExecutionEvent(this, "methodToMonitor", MethodExecutionStatus.END);
        this.publisher.publishEvent(endEvent);


    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
