package com.mouse.autumn.other.event2;

import java.util.EventListener;

/**
 * @Title: Listener
 * @Package com.mouse.autumn.other.event2
 * @Description: 监听器
 * @author Mahone Wu
 * @date 2018/9/6 14:44
 * @version V1.0
 */
public class Listener implements EventListener {


    public void listener(ButtonEvent event){
        System.out.println("做了什么操作 ：" +  event.getOperator());
    }


}
