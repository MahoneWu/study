package com.mouse.autumn.chapter04.castest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Mahone Wu on 2018/8/15.
 */
public class TestAtomic {
    //线程数
    private static final int MAX_THREADS = 3;
    //任务数
    private static final int TASK_COUNT = 3000;
    //目标总数
    private static final int TARGET_COUNT = 3;
    //无锁的原子操作
    private static AtomicInteger acount = new AtomicInteger();
    private int count;

    protected synchronized int inc(){
        return count++;
    }

    protected synchronized int getCount(){
        return count;
    }

   public static class SyncThread implements Runnable {

        protected String name;
        protected long starttime;

        TestAtomic out;

        public SyncThread(long starttime, TestAtomic out) {
            this.starttime = starttime;
            this.out = out;
        }

        @Override
        public void run() {
            int v = out.inc();
            while (v < TARGET_COUNT) {
                v = out.inc();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("SynchThread spend:" + (endTime - starttime) + "ms " + "v=" + v);
        }
    }

     public static class  AtomicThread implements Runnable{

        protected String name;
        protected long starttime;

        public AtomicThread(long starttime) {
            this.starttime = starttime;
        }

         public AtomicThread() {
         }

         @Override
        public void run() {

            int v = acount.incrementAndGet();
            while (v < TARGET_COUNT){
                v = acount.incrementAndGet();
            }
            long endtime = System.currentTimeMillis();
            System.out.println("AtomicThread spend:" + (endtime - starttime) + "ms " + "v=" + v);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ExecutorService exe = Executors.newFixedThreadPool(MAX_THREADS);
        long starttime = System.currentTimeMillis();
        AtomicThread atomic = new AtomicThread(starttime);
        for (int i=0; i<TASK_COUNT;i++) {
            exe.submit(atomic);
        }
        Thread.sleep(1000);

        ExecutorService exeAtomic = Executors.newFixedThreadPool(MAX_THREADS);
        long start = System.currentTimeMillis();
        TestAtomic testAtomic = new TestAtomic();
        SyncThread syncThread = new SyncThread( start,testAtomic);
        for (int i=0; i<TASK_COUNT;i++) {
            exeAtomic.submit(syncThread);
        }
        Thread.sleep(10000);


    }





}
