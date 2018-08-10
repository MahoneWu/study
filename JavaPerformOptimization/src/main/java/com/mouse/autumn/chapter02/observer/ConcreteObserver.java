package com.mouse.autumn.chapter02.observer;

/**
 * @Title: ConcreteObserver
 * @Package com.mouse.autumn.chapter02.observer
 * @Description: 具体观察者
 * @author Mahone Wu
 * @date 2018/8/10 17:53
 * @version V1.0
 */
public class ConcreteObserver implements IObserver {

    @Override
    public void update(Event event) {
        System.out.println("observe receives information");
    }
}
