package com.mouse.autumn.chapter04.synchronizedtest;

/**
 * Created by Mahone Wu on 2018/8/14.
 */
public class Runner {

    public static void main(String[] args) throws InterruptedException {

        final  BlockQueue blockQueue = new BlockQueue();

        for (int i = 0;i < 10; i++ ) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        blockQueue.pop();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        for (int i = 0;i < 100; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                        blockQueue.put("123");

                }
            }).start();
        }

        blockQueue.put("1");
        blockQueue.put("2");
        blockQueue.pop();
        System.out.println(blockQueue.getList());
        }




    }


