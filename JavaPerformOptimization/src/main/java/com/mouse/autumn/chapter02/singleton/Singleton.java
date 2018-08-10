package com.mouse.autumn.chapter02.singleton;

/**
 * @Title: Singleton
 * @Package com.mouse.autumn.chapter02.singleton
 * @Description: 缺点:无法对instance实例做延迟加载
 * @author Mahone Wu
 * @date 2018/8/10 18:39
 * @version V1.0
 */
public class Singleton {


    private Singleton(){
        System.out.println("Singleton is create ");
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    public static void createString(){
        System.out.println("createString in Singleton");
    }



}
