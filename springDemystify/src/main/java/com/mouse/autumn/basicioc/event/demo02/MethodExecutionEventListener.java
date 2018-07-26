package com.mouse.autumn.basicioc.event.demo02;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Mahone Wu on 2018/7/19.
 */
public class MethodExecutionEventListener implements ApplicationListener{


    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof MethodExecutionEvent){
            System.out.println("============="+((MethodExecutionEvent) event).getMethodName());
        }
    }
}
