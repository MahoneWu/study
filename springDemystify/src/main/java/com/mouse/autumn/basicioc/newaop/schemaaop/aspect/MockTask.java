package com.mouse.autumn.basicioc.newaop.schemaaop.aspect;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class MockTask implements ITask {

    @Override
    public void execute() {
        System.out.println("task executed");
    }


    @Override
    public String execute(String name) {
        return "world";
    }
}
