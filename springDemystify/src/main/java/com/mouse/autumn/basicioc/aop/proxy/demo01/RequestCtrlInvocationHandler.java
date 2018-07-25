package com.mouse.autumn.basicioc.aop.proxy.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Mahone Wu on 2018/7/25.
 */
public class RequestCtrlInvocationHandler implements InvocationHandler {

    private Object target;

    public RequestCtrlInvocationHandler(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().equalsIgnoreCase("request")){
            return method.invoke(target, args);
        }
        return null;
    }
}
