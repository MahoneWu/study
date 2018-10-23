package com.mouse.autumn.java;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by Mahone Wu on 2018/9/14.
 */
public class Runner {


    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

    // runState is stored in the high-order bits
    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int SHUTDOWN   =  0 << COUNT_BITS;
    private static final int STOP       =  1 << COUNT_BITS;
    private static final int TIDYING    =  2 << COUNT_BITS;
    private static final int TERMINATED =  3 << COUNT_BITS;

    public static void main(String[] args) throws IOException {
        int count = 1;
        int pageSize = 1000;
        for (int i = 0; i < count; i++) {
            for (int j = (i - 1) * pageSize; j < pageSize * i; j++) {
                //System.out.println(j);
            }
        }


//        System.out.println(CAPACITY);
//        System.out.println(RUNNING);
//        System.out.println(SHUTDOWN);
//        System.out.println(STOP);
//        System.out.println(TIDYING);
//        System.out.println(TERMINATED);


        ArrayList<Integer> str = new ArrayList<>();
        str.add(1);
        str.add(2);
        str.add(3);
        str.add(5);
        str.add(6);
//        for (int i = str.size() - 1; i >= 0; i--) {
//            Integer value = str.get(i);
//            if (value == 3 || value == 5) {
//                str.remove(i);
//            }
//        }

        for (int i = 0; i < str.size(); i++) {
            Integer value = str.get(i);
            if (value == 3 || value == 5) {
                str.remove(i);
            }
        }

        System.out.println("---->"+str);

        String a = "123";

        a += "eee";
        System.out.println(a);

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        for (Integer s : list) {
//            if (s == 1) {
//                list.remove(s);
//            }
//        }

        Integer value = 10;

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(value);
// // 读出当前对象的二进制流信息
        System.out.println(bos.size());

    }
}
