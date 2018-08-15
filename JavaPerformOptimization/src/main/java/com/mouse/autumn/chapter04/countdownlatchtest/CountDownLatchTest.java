package com.mouse.autumn.chapter04.countdownlatchtest;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/14
 *
 *
 * https://blog.csdn.net/bntX2jSQfEHy7/article/details/78237208
 *
 * CountDownLatch这个类能够使一个线程等待其他线程完成之后的工作后再执行。
 *
 *
 */
public class CountDownLatchTest {


    private final static  CountDownLatch countDownLatch = new CountDownLatch(7);



    public static void main(String[] args) throws InterruptedException {


        for(int i = 1 ; i <= 7 ;i++){
            int index = i;
            new Thread(() ->{
                try {
                    System.out.println("第" +index +"颗龙珠已经收集到") ;
                    Thread.sleep(new Random().nextInt(200));
                }catch (Exception e){

                }
                countDownLatch.countDown();
            }).start();
        }


        countDownLatch.await();

        System.out.println("收集齐了");

    }
}
