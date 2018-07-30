package com.mouse.autumn.basicioc.newaop.advice.aroundadvice.simple;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
public class AroundMethod {


    public boolean execute(String name, String msg) {

        System.out.println("--" + name + ":" + msg);

        return Boolean.TRUE;

    }

}
