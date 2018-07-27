package com.mouse.autumn.basicioc.aop.proxyfactory;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class MockTask implements ITask {

    @Override
    public void execute() {
        System.out.println("task executed");
    }
}
