package com.mouse.autumn.basicioc.newaop.advice.afterreturningadvice;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
public class ReturnMethod {

    public boolean execute(String name, String message) {
        System.out.println("ExceptionMethod:" + name + ":" + message);
        return Boolean.TRUE;

    }


}
