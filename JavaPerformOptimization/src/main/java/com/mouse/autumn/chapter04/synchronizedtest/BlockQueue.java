package com.mouse.autumn.chapter04.synchronizedtest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahone Wu on 2018/8/14.
 */
public class BlockQueue {


    private List list = new ArrayList<>();

    public synchronized Object pop() throws InterruptedException{
        while (list.size() == 0){
            System.out.println("wait.............id=" + Thread.currentThread().getId());
            this.wait();
        }
        if( list.size() > 0 ){
            return list.remove(0);
        }else {
            return null;
        }
    }

    public synchronized void put(Object object){
        list.add(object);
        System.out.println("notify................id=" +Thread.currentThread().getId());
        this.notify();
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}


