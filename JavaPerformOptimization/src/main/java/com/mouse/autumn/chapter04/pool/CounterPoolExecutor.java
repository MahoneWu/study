package com.mouse.autumn.chapter04.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Mahone Wu on 2018/8/15.
 */
public class CounterPoolExecutor extends ThreadPoolExecutor {

    private AtomicInteger count = new AtomicInteger();

    public long starttime = 0;
    public String funcname = "";

    public CounterPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime,
                               TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        int l = count.addAndGet(1);//统计执行次数
        if (l == 4000) {
            System.out.println(funcname + "spend time :" + (System.currentTimeMillis() - starttime));
        }
    }
}
