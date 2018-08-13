package com.mouse.autumn.chapter04.producertest;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/13
 */
public class Consumer implements Runnable {


    private BlockingQueue<PCData> queue;

    private static final int SLEEPTIME = 1000;


    public Consumer(BlockingQueue<PCData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {


        System.out.println("start Consumer id = " + Thread.currentThread().getId());

        Random r = new Random();

        try {
            while (true){
                PCData data = queue.take();

                if(data != null){
                    int re = data.getIntData() * data.getIntData();


                    System.out.println("---"+MessageFormat.format("{0}*{1} = {2}",
                            data.getIntData(), data.getIntData(),re));

                    Thread.sleep(SLEEPTIME);

                }

            }
        }catch (Exception e){

        }




    }
}
