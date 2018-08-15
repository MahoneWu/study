package com.mouse.autumn.chapter04.threadlocaktest;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Mahone Wu on 2018/8/15.
 */
public class Runner {


    public static void main(String[] args) {

       /* for (int i = 0;i<1;i++) {
            new Thread(new MyThread(new Date().getTime())).start();
        }*/

        MyThread myThread = new MyThread(new Date().getTime());

        for(int i = 0 ; i < 5;i++){
            new Thread(myThread).start();
        }


        AtomicInteger i = new AtomicInteger(10);
        System.out.println(i.getAndDecrement());
        System.out.println(i.get());



    }



}
