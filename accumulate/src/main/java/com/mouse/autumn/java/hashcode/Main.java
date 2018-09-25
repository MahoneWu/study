package com.mouse.autumn.java.hashcode;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Mahone Wu on 2018/9/13.
 */
public class Main {

    private static final ObjectMapper JACKSON = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        Address address = new Address();
        List<Address> list = new ArrayList<>();
        Set set = new HashSet();
        address.setAddress("1");
        address.setCity("1");
        address.setPhone("1");
        list.add(address);
        set.add(address);

        address = new Address();
        address.setAddress("2");
        address.setCity("2");
        address.setPhone("2");
        list.add(address);
        set.add(address);

        address = new Address();
        address.setAddress("3");
        address.setCity("3");
        address.setPhone("3");
        list.add(address);
        set.add(address);

        address = new Address();
        address.setAddress("1");
        address.setCity("1");
        address.setPhone("1");
        list.add(address);
        set.add(address);

        //System.out.println(list);

        String listJsonStr = JACKSON.writeValueAsString(list);
        String setJsonStr =  JACKSON.writeValueAsString(set);
        System.out.println("list ==== " + listJsonStr);
        System.out.println("set ==== " + setJsonStr);

        //System.out.println(listJsonStr);

        //System.out.println(set);


        //Set<Address> setList = (Set<Address>);
        //System.out.println(JACKSON.readValue(listJsonStr, Address.class));
        Set<Address> resultList = JACKSON.readValue(listJsonStr,new TypeReference<Set<Address>>() { });
        System.out.println(resultList);

    }

}
