package com.mouse.autumn.basicioc.event.demo01;

import java.util.EventObject;

/**
 * Created by Mahone Wu on 2018/7/18.
 * 给出自定义事件类型
 */
public class MethodExecutionEvent  extends EventObject{

    private String methodName;

    public MethodExecutionEvent(Object source) {
        super(source);
    }

    public MethodExecutionEvent(Object source, String methodName) {
        super(source);
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
