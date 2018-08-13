package com.mouse.autumn.chapter04.producertest;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/13
 */
public class PCData {


    private final int intData;

    public PCData(int intData) {
        this.intData = intData;
    }



    public int getIntData() {
        return intData;
    }


    @Override
    public String toString() {
        return "data:" + intData;
    }
}
