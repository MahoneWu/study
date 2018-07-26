package com.mouse.autumn.basicioc.aop.proxy.demo01;

/**
 * Created by Mahone Wu on 2018/7/25.
 */
public class RequestableImpl implements IRequestable {


    @Override
    public void request() {
        System.out.println("request processed in RequestableImpl");
    }
}
