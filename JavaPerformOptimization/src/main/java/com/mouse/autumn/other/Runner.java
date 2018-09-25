package com.mouse.autumn.other;

/**
 * Created by Mahone Wu on 2018/9/10.
 */
public class Runner {


    public static void main(String[] args) {
        try {
            String a = null;
            System.out.println(a.toString());
        }catch (Exception ex){
            StackTraceElement stackTraceElement= ex.getStackTrace()[0];// 得到异常棧的首个元素
            System.out.println("File="+stackTraceElement.getFileName());// 打印文件名
            System.out.println("Line="+stackTraceElement.getLineNumber());// 打印出错行号
            System.out.println("Method="+stackTraceElement.getMethodName());// 打印出错方法
        }


        String a = "a" + "b" + 1;
        String b = "ab1";
        System.out.println(a==b);


    }
}
