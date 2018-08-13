package com.mouse.autumn.chapter04.futuretest01;

/**
 * Created by Mahone Wu on 2018/8/13.
 */
public class Runner {


    public static void main(String[] args) {
        Client client = new Client();


        Data data = client.request("name");

        System.out.println("请求完毕");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("数据 = " +data.getResult());
    }




}
