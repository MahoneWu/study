package com.mouse.autumn.basicioc.newaop.advice.declare;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
public class TaskImpl implements ITask {


    @Override
    public void execute() {
        System.out.println("执行任务......");
    }
}
