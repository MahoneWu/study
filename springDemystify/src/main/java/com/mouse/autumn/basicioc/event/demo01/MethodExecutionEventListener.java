package com.mouse.autumn.basicioc.event.demo01;

import java.util.EventListener;

/**
 * Created by Mahone Wu on 2018/7/18.
 * 实现针对自定义事件类的事件监听器接口
 */
public interface MethodExecutionEventListener  extends EventListener{


    void onMethodBegin(MethodExecutionEvent event);

    void onMethodEnd(MethodExecutionEvent event);


}
