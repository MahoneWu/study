package com.mouse.autumn.basicioc.aop.introductionadvisor;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class DelegateImpl implements IDelegateInterface {


    @Override
    public void print() {
        System.out.println("-------------");
    }
}
