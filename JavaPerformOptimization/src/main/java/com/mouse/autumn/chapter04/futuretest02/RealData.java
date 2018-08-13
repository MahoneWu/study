package com.mouse.autumn.chapter04.futuretest02;

import java.util.concurrent.Callable;

/**
 * Created by Mahone Wu on 2018/8/13.
 */
public class RealData implements Callable<String> {


    protected  String result;


    public RealData(String result) {
        this.result = result;
    }


    @Override
    public String call() throws Exception {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<10;i++) {
            sb.append(result);
            try {
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
        return  sb.toString();
    }

}
