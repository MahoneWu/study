package com.mouse.autumn.basicioc.factorybean.staticfactory02;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class StaticBarInterfaceFactory {



    public static BarInterface getInstance(FooBar fooBar){
        return new BarInterfaceImpl(fooBar);
    }


}
