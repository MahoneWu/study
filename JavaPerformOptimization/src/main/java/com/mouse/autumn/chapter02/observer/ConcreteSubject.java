package com.mouse.autumn.chapter02.observer;

import java.util.Vector;

/**
 * @Title: ConcreteSubject
 * @Package com.mouse.autumn.chapter02.observer
 * @Description: 具体主题实现
 * @author Mahone Wu
 * @date 2018/8/10 17:45
 * @version V1.0
 */
public class ConcreteSubject implements ISubject {

    Vector<IObserver> observers = new Vector<>();

    @Override
    public void attach(IObserver observer) {
        observers.addElement(observer);

    }

    @Override
    public void detach(IObserver observer) {
        observers.removeElement(observer);
    }

    @Override
    public void inform() {
        Event event = new Event();
        for (IObserver ob: observers){
            ob.update(event);//通知观察者
        }
    }

    public Vector<IObserver> getObservers() {
        return observers;
    }

    public void setObservers(Vector<IObserver> observers) {
        this.observers = observers;
    }
}
