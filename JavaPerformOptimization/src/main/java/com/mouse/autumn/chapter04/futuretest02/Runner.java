package com.mouse.autumn.chapter04.futuretest02;

import java.util.concurrent.*;

/**
 * Created by Mahone Wu on 2018/8/13.
 */
public class Runner {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> future = new FutureTask<String>(new RealData("a"));

        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.submit(future);
        System.out.println("请求完毕");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("数据 = " +future.get());


    }




}
