package com.mouse.autumn.chapter04.semaphoretest;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/14
 */
public class Runner {


    public static void main(String[] args) {
        for (int i = 0 ; i< 10;i++){
            new Thread(new CustomerRunner()).start();
        }
    }

}
