package com.mouse.autumn.basicioc;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/5
 */
public class Test {


    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e){
            System.out.println(2);
        }
//        catch (ArithmeticException e){
//            System.out.println("1");
//        }

    }


}
