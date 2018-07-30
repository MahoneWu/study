package com.mouse.autumn.basicioc.aop.proxy.demo02;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Title: RequestCtrlCallaback
 * @Package com.mouse.autumn.basicioc.aop.proxy.withinandtarget
 * @Description: https://www.cnblogs.com/shijiaqi1066/p/3429691.html
 * @author Mahone Wu
 * @date 2018/7/25 16:50
 * @version V1.0
 */
public class RequestCtrlCallaback implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if(method.getName().equalsIgnoreCase("request")){
            return methodProxy.invokeSuper(o, args);
        }
        return null;
    }
}


