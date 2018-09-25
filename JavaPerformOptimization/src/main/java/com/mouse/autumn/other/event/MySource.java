package com.mouse.autumn.other.event;

import java.util.Vector;

/**
 * @Title: MySource
 * @Package com.mouse.autumn.other.event
 * @Description: 事件源
 * @author Mahone Wu
 * @date 2018/9/6 14:01
 * @version V1.0
 */
public class MySource {


    private int value;
    Vector<Listener> listeners = new Vector<>();

    public  void addListener(Listener listener){
        listeners.add(listener);
    }

    public void setValue(int value){
        this.value = value;
        MyEvent e = new MyEvent();
        e.setValue(value);
        for (int i = 0 ;i<listeners.size();i++){
            listeners.get(i).eventChanged(e);
        }
    }

}
