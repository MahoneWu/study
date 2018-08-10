package com.mouse.autumn.chapter02.observer;

/**
 * Created by Mahone Wu on 2018/8/10.
 */
public class Runner {


    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();//新建具体主题对象

        ConcreteObserver concreteObserver = new ConcreteObserver();//观察者对象

        subject.attach(concreteObserver);

        subject.inform();

    }


}
