package com.mouse.autumn.chapter02.observer;


/**
 * @Title: ISubject
 * @Package com.mouse.autumn.chapter02.observer
 * @Description: 主题接口
 * @author Mahone Wu
 * @date 2018/8/10 17:40
 * @version V1.0
 */
public interface ISubject {

    void attach(IObserver observer);//添加观察者

    void detach(IObserver observer);//删除观察者

    void inform();//通知所有观察者



}
