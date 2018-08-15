package com.mouse.autumn.chapter04.threadlocaktest;

import java.util.Date;

/**
 * Created by Mahone Wu on 2018/8/15.
 */
public class MyThread implements Runnable {


    public static final ThreadLocal<Date> localvar = new ThreadLocal<>();
    public static final ThreadLocal<Date> localvar2 = new ThreadLocal<>();

    private long time;

    public MyThread(long time) {
        this.time = time;
    }

    @Override
    public void run() {
        Date d = new Date(time);

        localvar.set(d);
        localvar2.set(new Date());

        if (localvar.get().getTime() != time) {
            System.out.println("id  = " + time + "  localvar = " + localvar.get().getTime());
        }
    }
}
