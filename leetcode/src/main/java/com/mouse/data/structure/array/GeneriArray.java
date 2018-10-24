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
        data[index] = e;
        size++;
    }


    public void addFirst(T e){
        add(0, e);
    }

    public void addLast(T e){
        add(size, e);
    }

    public T remove(int index){
        checkIndex(index);
        T ret = data[index];

        for (int i = index+1;i<size;i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        return ret;
    }

    /**
     * 扩容方法，时间复杂度O(n)
     * @param capacity
     */
    private void resize(int capacity) {
        T[] newData =(T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public T removeFirst(){
        return remove(0);
    }


    public T removeLast(){
        return remove(size - 1);
    }

    public void removeElement(T  e){
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }


    private void checkIndex(int index) {
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed! required index >=0 and index  <= size");
        }
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Array size = %d, capacity = %d \n", size, data.length));
        builder.append('[');
        for (int i = 0; i < size; i++) {
            builder.append(data[i]);
            if (i != size - 1) {
                builder.append(", ");
            }
        }
        builder.append(']');
        return builder.toString();
    }


    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[0] = 2;
        System.out.println(arr);
        for(int i = 0 ; i <5;i++){
            System.out.println(arr[i]);
        }
    }
}
