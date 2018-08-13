package com.mouse.autumn.java.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/12
 */
public class TreeSetMain {


    public static void main(String[] args) {


        Set set = new TreeSet();

        Person person = new Person();
        set.add(person);

        person = new Person();
        set.add(person);

        person = new Person();
        set.add(person);

        System.out.println(set);




    }


}
