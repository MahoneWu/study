package com.mouse.autumn.other.event2;

import java.util.EventObject;

/**
 * @Title: ButtonEvent
 * @Package com.mouse.autumn.other.event2
 * @Description: 事件
 * @author Mahone Wu
 * @date 2018/9/6 14:43
 * @version V1.0
 */
public class ButtonEvent extends EventObject {
    /**
     * Constructs a prototypical ButtonEvent.
     *
     * @param source The object on which the ButtonEvent initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ButtonEvent(Object source) {
        super(source);
    }

    private String operator;

    public void controlSwitch(String operator){
        this.operator = operator;
        System.out.println("-----------" + operator);
    }


    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
