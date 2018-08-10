package com.mouse.autumn.chapter02.singleton;

/**
 * Created by Mahone Wu on 2018/8/10.
 */
public class LazySingleton {


    private LazySingleton(){
        System.out.println("LazySingleton is create");
    }

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
