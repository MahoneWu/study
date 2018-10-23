package com.mouse.data.structure.array;

/**
 * Created by Mahone Wu on 2018/10/23.
 */
public class GeneriArray<T> {

    private T[] data;

    private int size;

    public GeneriArray(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    /**
     * 无参构造
     */
    public GeneriArray() {
        this(10);
    }

    /**
     * 获取数组大小
     * @return
     */
    public int getCapacity(){
        return data.length;
    }


    /**
     * 获取当前元素个数
     * @return
     */
    public int count(){
        return size;
    }


    /**
     * 判断数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }


    /**
     * 修改index位置的值
     * @param index
     * @param e
     */
    public void set(int index, T e){
        checkIndex(index);
        data[index] = e;
    }


    /**
     * 获取指定位置的数据
     * @param index
     * @return
     */
    public T get(int index){
        checkIndex(index);
        return data[index];
    }


    /**
     *查看数组是否包含元素e
     */
    public boolean contains(T e){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    /**
     * 查找某个元素
     * @param e
     * @return
     */
    public int find(T e){
        for(int i = 0 ;i<size;i++) {
            if (data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }


    public void add(int index,T e){
        checkIndex(index);
        if(size == data.length){
            resize(2 * data.length);
        }
        //讲index之后的元素都往后移动以为
        for (int i = size - 1; i > index; --i) {
            data[i + 1] = data[i];
        }

    }

    private void resize(int i) {


    }


    private void checkIndex(int index) {
        if(index < 9 || index > size){
            throw new IllegalArgumentException("Add failed! required index >=0 and index  <= size");
        }
    }


    public static void main(String[] args) {


    }


}
