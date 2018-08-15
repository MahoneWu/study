package com.mouse.autumn.chapter04.semaphoretest;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/14
 */
public class Runner2 {


    public static void main(String[] args) {

        CustomerRunner2 customerRunner = new CustomerRunner2();
        for (int i = 0 ; i< 10;i++){
            new Thread(customerRunner).start();
        }





    }



}
