package com.mouse.autumn.java;

/**
 * Created by Mahone Wu on 2018/8/6.
 * https://blog.csdn.net/taotao4/article/details/43918131
 */
public class Error {


    public static void main(String[] args) {
       /* try{
            System.out.println(1/0);
        }catch (Exception ex){
            StackTraceElement stackTraceElement= ex.getStackTrace()[0];// 得到异常棧的首个元素
            System.out.println("File="+stackTraceElement.getFileName());// 打印文件名
            System.out.println("Line="+stackTraceElement.getLineNumber());// 打印出错行号
            System.out.println("Method="+stackTraceElement.getMethodName());// 打印出错方法
        }
        try{
            System.out.println(20/0);
        }catch (Exception ex){
            System.out.println("错误信息e = " +ex);
        }

        try{
            System.out.println(20/0);
        }catch (Throwable ex){
            System.out.println("错误信息e = " +ex);
        }*/

        int i = 0;
        String x = null;
        while (i < 100000000) {
            try {
                System.out.println("当前执行次数为：" + i);
                getNPE(x);
            } catch (Exception e) {
                int lth = e.getStackTrace().length;
                System.out.println("length：" + lth);
                e.printStackTrace();
                if (lth == 0) {
                    return;
                }
            }
            i++;
        }
    }


    private static void getNPE(String x) {
        System.out.println("当前字母为：" + x.toString());
    }

}
