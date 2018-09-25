package com.mouse.autumn.other.event;

/**
 * @Title: MyListener
 * @Package com.mouse.autumn.other.event
 * @Description: 监听事件器
 * @author Mahone Wu
 * @date 2018/9/6 14:01
 * @version V1.0
 */
public class MyListener implements Listener {


    @Override
    public void eventChanged(MyEvent e) {
        System.out.println("value changed to :" +e.getValue());
    }
}
