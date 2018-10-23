package com.mouse.data.structure.array;

/**
 * Created by Mahone Wu on 2018/10/23.
 */
public class Array {

    //定义整形数据data保存数据
    private int data[];

    //定义数组长度
    private int n;

    //数组实际个数
    private int count;

    public Array(int capacity){
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }


    public int find(int index) {
        if(index < 0 || index > count) return -1;
        return data[index];
    }

    public boolean insert(int index,int value){


     /*   if (index == count && count == 0) {
            data[index] = value;
            ++count;
            return true;
        }*/


        if(count == n){
            System.out.println("数组满了,哈哈哈哈哈");
            return false;
        }
        if(index < 0 || index > count){
            System.out.println("位置不合法");
            return false;
        }
        for (int i = count;i> index;--i) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        ++count;
        return true;
    }


    public boolean delete(int index) {
        if(index < 0 || index > count) {
            return false;
        }
        for (int i = index + 1;i<count;i++){
            data[i - 1] = data[i];
        }
        --count;
        return true;
    }


    public void printAll(){
        for (int i = 0;i < count;++i) {
            System.out.println(data[i] + "");
        }
        System.out.println(data);
    }

    public static void main(String[] args) {
        Array array = new Array(5);

        array.printAll();

        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);
        array.insert(3, 10);
        array.printAll();
    }







}
