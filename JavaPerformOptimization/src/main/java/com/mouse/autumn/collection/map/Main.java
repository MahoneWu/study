package com.mouse.autumn.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Mahone Wu on 2018/9/11.
 */
public class Main {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        for (int i = 0 ; i < 6 ; i++){
            map.put(i + "", i + "");
        }
        entrySetPrintMethod(map);
    }


    /**
     * @Description:entrySet循环输出
     *
     */
    public static void entrySetPrintMethod(Map<String,String> map){
        Set<Map.Entry<String, String>> set =  map.entrySet();
        for(Map.Entry<String,String> entry : set){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("entrySetPrintMethod --> key :" + key + " value = " + value);
        }
    }


    /**
     * @Description:描述
     *
     *
     */
    public static  void entrySetCollectionPrintMethod(Map<String,String> map){
        Set<Map.Entry<String, String>> set =  map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("entrySetCollectionPrintMethod -->   key :" + key + " value = " + value);
        }
    }


    /**
     * @Description:描述
     *
     *
     */
    public static  void keySetPrintMethod(Map<String,String> map){
        for (String key : map.keySet()){
            String value = map.get(key);
            System.out.println("keySetPrintMethod  ---> key :" + key + " value = " + value);
        }
    }




















}
