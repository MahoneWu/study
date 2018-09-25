package com.mouse.autumn.collection.listdemo;

import java.util.*;

/**
 * Created by Mahone Wu on 2018/9/11.
 */
public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
       for(int i = 0 ; i <= 5 ; i++){
           list.add(i+"");
       }
        //forPrintMethod(list);
        iteratorPrintMethod(list);
        foreach(list);
    }

    /**
     *
     * @Description:iterator循环输出
     *
     */
    public static void iteratorPrintMethod(List<String> list) {
        Iterator iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()) {

            if (count == 2) {
                iterator.remove();
            }
            System.out.println("iterator---> "+iterator.next());
            count++;
        }
        System.out.println(list.size());
    }


    /**
     * @Description:for循环输出,删除会报出java.util.ConcurrentModificationException
     *
     * 遍历者自己在集合外部维护一个计数器，然后依次读取每一个位置的元素，当读取到最后一个元素后，停止。主要就是需要按元素的位置来读取元素。
     *
     * @version:V1.0
     */
    public static void  forPMethod(List<String> list){
        int size = list.size();
        int count = 0;
        for(int i = 0;i < size ; i++){
            System.out.println("for--->  " + list.get(i));
            if(count == 2){
                list.remove(i);
            }
            count++;
        }
    }

    /**
     * @Description:foreach循环
     *
     *
     * foreach内部也是采用了Iterator的方式实现，只不过Java编译器帮助我们生成了这些代码
     *
     */
    public static void foreach(List<String> list){
        int count = 0;
        for(String s : list){
            System.out.println("foreach --->" + s);
            if(count == 2){
                list.remove(s);
            }
            count++;
        }
    }


    /**
     * @Description:描述
     *
     * 双向输出
     *
     */
    public static  void listIteratorPrintMethod(List<String> list){
        ListIterator<String> iter = list.listIterator();
        //由前向后输出
        while(iter.hasNext()) {
            System.out.print( "listIteratorMethod 前到后--->"+iter.next());
        }
        //由后向前输出：
        while(iter.hasPrevious()) {
            System.out.print("listIteratorMethod 前到后--->" + iter.previous());
        }
    }


    public static void enumPrintMethod() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println("enum ---> " + enumeration.nextElement());
        }


    }








}
