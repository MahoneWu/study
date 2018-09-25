package com.mouse.autumn.other.event;

/**
 * Created by Mahone Wu on 2018/9/6.
 */
public class Runner {


    public static void main(String[] args) {

        MySource mySource = new MySource();

        MyListener l = new MyListener();

        mySource.addListener(l);
        mySource.setValue(1);




    }




}
