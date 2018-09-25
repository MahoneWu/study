package com.mouse.autumn.other.event2;

import java.util.Vector;

/**
 * @Title: ButtonSource
 * @Package com.mouse.autumn.other.event2
 * @Description: 事件源
 * @author Mahone Wu
 * @date 2018/9/6 14:43
 * @version V1.0
 */
public class ButtonSource  {

    Vector<Listener> vector = new Vector();

    public void addListeners(Listener listener){
        vector.add(listener);
    }


    public void modifyEvent(String operator){
        notify(operator);
    }


    public void notify(String operator){
        ButtonEvent event = new ButtonEvent(this);
        event.controlSwitch(operator);
        for (int i = 0 ; i < vector.size(); i++){
            vector.get(i).listener(event);
        }
    }



}
