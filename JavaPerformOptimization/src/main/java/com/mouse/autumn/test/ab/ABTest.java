package com.mouse.autumn.test.ab;

import java.util.concurrent.Semaphore;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/14
 *
 * http://mouselearnjava.iteye.com/blog/1949228
 *
 *     public Semaphore s2 = new Semaphore(0);
 *     s2.release();s2的通行证会+1么？
 *
 *     semaphore是信号量，其为多线程协作提供了更为强大的控制方法。广义上说，信号量是对锁的拓展。
 *     信号量可以指定多个线程同时访问某一资源
 *
 *
 *
 */
public class ABTest {


    public static void main(String[] args) {
        Print print = new Print();
        for (int i= 0 ; i<100;i++) {
            new Thread(print).start();
        }
    }



     static class Print implements Runnable{
        Semaphore semaphore = new Semaphore(1,true);
        int count = 0;
        @Override
        public void run() {
            try {
                semaphore.acquire();
                if(count % 2 == 0){
                    System.out.println("A");
                }else{
                    System.out.println("B");
                }
                count++;
                semaphore.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
