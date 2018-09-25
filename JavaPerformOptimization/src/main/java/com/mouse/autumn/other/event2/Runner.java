package com.mouse.autumn.other.event2;

/**
 * Created by Mahone Wu on 2018/9/6.
 */
public class Runner {
    public static void main(String[] args) {
        ButtonSource source = new ButtonSource();
        Listener listener = new Listener();
        source.addListeners(listener);
        source.modifyEvent("open");
    }
}
