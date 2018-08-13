package com.mouse.autumn.java.collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/12
 */
public class HashTableMain {


    public static void main(String[] args) {


        Map map = new Hashtable<>();

//        map.put("a", null);
//        map.put("b", null);
//        map.put("c", null);

        map.put(null, "a");
        map.put("b", "b");
        map.put("c", "c");

        System.out.println(map);





    }



}
