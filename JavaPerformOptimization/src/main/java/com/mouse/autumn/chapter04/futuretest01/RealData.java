package com.mouse.autumn.chapter04.futuretest01;

/**
 * Created by Mahone Wu on 2018/8/13.
 */
public class RealData {


    protected final String result;


    public RealData(String result) {
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<10;i++) {
            sb.append(result);
            try {
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
        this.result = sb.toString();
    }

    public String getResult() {
        return result;
    }
}
