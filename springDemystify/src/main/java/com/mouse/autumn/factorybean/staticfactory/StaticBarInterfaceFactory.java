package com.mouse.autumn.factorybean.staticfactory;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class StaticBarInterfaceFactory {


    public static BarInterface getInstance(){
        return new BarInterfaceImpl();
    }


}
