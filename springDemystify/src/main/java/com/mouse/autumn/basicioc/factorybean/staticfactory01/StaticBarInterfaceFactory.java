package com.mouse.autumn.basicioc.factorybean.staticfactory01;

import com.mouse.autumn.basicioc.factorybean.staticfactory02.FooBar;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class StaticBarInterfaceFactory {


    public static BarInterface getInstance(){
        return new BarInterfaceImpl();
    }



}
