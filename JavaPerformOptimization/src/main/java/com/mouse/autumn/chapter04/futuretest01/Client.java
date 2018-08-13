package com.mouse.autumn.chapter04.futuretest01;

/**
 * Created by Mahone Wu on 2018/8/13.
 */
public class Client {


    public Data request(final String queryStr){
        final FutureData future = new FutureData();
        new Thread(){
            @Override
            public void run(){
                RealData realData = new RealData(queryStr);
                future.setRealData(realData);
            }
        }.start();
        return future;
    }



}
