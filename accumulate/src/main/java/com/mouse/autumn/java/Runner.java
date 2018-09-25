package com.mouse.autumn.java;

/**
 * Created by Mahone Wu on 2018/9/14.
 */
public class Runner {


    public static void main(String[] args) {
        int count = 1;
        int pageSize = 1000;
        for (int i = 0; i < count; i++) {
            for (int j = (i - 1) * pageSize; j < pageSize * i; j++) {
                System.out.println(j);
            }
        }
    }


}
