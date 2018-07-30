package com.mouse.autumn.basicioc.newaop.advice.declare;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
public class CountImpl implements ICounter {

    @Override
    public String count() {
        System.out.println("数量++");
        return "hello,world";
    }
}
