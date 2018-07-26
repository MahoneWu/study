package com.mouse.autumn.basicioc.aop.proxy.demo01;

import java.lang.reflect.Proxy;

/**P
 * Created by Mahone Wu on 2018/7/25.
 */
public class ProxyRunner {

    public static void main(String[] args) {
        ISubject subject = (ISubject)Proxy.newProxyInstance(ProxyRunner.class.getClassLoader(),
                new Class[]{ISubject.class},
                new RequestCtrlInvocationHandler(new SubjectImpl()));
        subject.request();

        IRequestable requestable = (IRequestable)Proxy.newProxyInstance(ProxyRunner.class.getClassLoader(),
                new Class[]{IRequestable.class},
                new RequestCtrlInvocationHandler(new RequestableImpl()));
        requestable.request();
    }

}
