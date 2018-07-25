package com.mouse.autumn.basicioc.aop.proxy.demo02;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by Mahone Wu on 2018/7/25.
 */
public class ProxyRunner {


    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Requestable.class);
        enhancer.setCallback(new RequestCtrlCallaback());

        Requestable proxy = (Requestable)enhancer.create();
        proxy.request();
    }


}
