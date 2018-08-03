package com.mouse.autumn.basicioc.jdbc.tranc;

/**
 * Created by Mahone Wu on 2018/8/1.
 */
public class TransactionResourceManage {


    private static ThreadLocal resources = new ThreadLocal();

    public static Object getResource(){
        return resources.get();
    }

    public static  void bindResource(Object resource){
        resources.set(resource);
    }

    public static Object ubindResource(){
        Object res = getResource();
        resources.set(null);
        return res;
    }



}
