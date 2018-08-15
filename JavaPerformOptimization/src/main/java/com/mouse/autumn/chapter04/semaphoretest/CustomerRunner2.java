package com.mouse.autumn.chapter04.semaphoretest;

import java.util.concurrent.Semaphore;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/14
 */
public class CustomerRunner2 implements Runnable {

    final Semaphore avaliable = new Semaphore(5, true);

    int count = 1;

    //AtomicInteger count = new AtomicInteger();




    @Override
    public void run() {
        int time = (int) (Math.random() * 10 + 3);
        int num = count++;
        try {
            avaliable.acquire();
            System.out.println("正在为第【" + num + "】个客户办理业务,需要时间：" + time + "s");
            Thread.sleep(time * 1000);
            if(avaliable.hasQueuedThreads()) {
                System.out.println("第【" + num + "】个客户办理完业务，下一位");
            }else {
                System.out.println("第【" + num + "】个客户办理完业，没有客户了。");
            }
            avaliable.release();

        }catch (Exception e){

        }




    }
}
