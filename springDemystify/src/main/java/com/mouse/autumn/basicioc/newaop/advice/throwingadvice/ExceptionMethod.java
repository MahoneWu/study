package com.mouse.autumn.basicioc.newaop.advice.throwingadvice;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
public class ExceptionMethod {


    public boolean execute(String name, String message) {

        System.out.println("ExceptionMethod:" + name + ":" + message);

        System.out.println(1 / 0);
        return Boolean.TRUE;

    }


}
