package com.mouse.autumn.basicioc.event.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahone Wu on 2018/7/18.
 */
public class MethodExecutionEventPublisher {


    private List<MethodExecutionEventListener> listeners = new ArrayList<>();


    public void methodToMonitor(){
        MethodExecutionEvent event2Publicsh = new MethodExecutionEvent(this, "methodToMonitor");
        publishEvent(MethodExecutionStatus.BEGIN, event2Publicsh);

        //todo

        publishEvent(MethodExecutionStatus.END, event2Publicsh);


    }


    public void publishEvent(MethodExecutionStatus status,MethodExecutionEvent event){
        //为了避免时间处理期间时间监听器的注册和移除操作影响处理过程,我们对事件发布时点的监听器列表进行了一个安全复制(safe-copy)
        List<MethodExecutionEventListener> copyListeners = new ArrayList<>(listeners);
        for (MethodExecutionEventListener listener : copyListeners){
            if(MethodExecutionStatus.BEGIN == status){
                listener.onMethodBegin(event);
            }else {
                listener.onMethodEnd(event);
            }
        }
    }


    public void addMethodExecutionEventListener(MethodExecutionEventListener listener){
        this.listeners.add(listener);
    }


    public void removeMethodExecutionEventListener(MethodExecutionEventListener listener){
        if(this.listeners.contains(listener)){
            this.listeners.remove(listener);
        }
    }

    public void removeAllListeners(MethodExecutionEventListener listener){
        this.listeners.clear();
    }


    public static void main(String[] args) {
        MethodExecutionEventPublisher eventPublisher = new MethodExecutionEventPublisher();
        eventPublisher.addMethodExecutionEventListener(new SimpleMethodExecutionEventListener());
        eventPublisher.methodToMonitor();
    }


}
