package com.mouse.autumn.chapter04.synchronousQueuetest;

import java.util.concurrent.SynchronousQueue;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/15
 */
public class SynchronousQueueTest {


    public static void main(String[] args) {
        SynchronousQueue<Integer> sq = new SynchronousQueue();
        try {
            sq.put(1);
            System.out.println(sq.take());
//            sq.put(2);
//            System.out.println(sq.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }


}
