package com.mouse.autumn.basicioc.event.demo01;

/**
 * Created by Mahone Wu on 2018/7/18.
 *
 *
 */
public class SimpleMethodExecutionEventListener implements MethodExecutionEventListener {


    @Override
    public void onMethodBegin(MethodExecutionEvent event) {
        String methodName = event.getMethodName();
        System.out.println("start to execute the method [" + methodName + "]");
    }

    @Override
    public void onMethodEnd(MethodExecutionEvent event) {
        String methodName = event.getMethodName();
        System.out.println("finished to execute the method [" + methodName + "]");
    }
}
