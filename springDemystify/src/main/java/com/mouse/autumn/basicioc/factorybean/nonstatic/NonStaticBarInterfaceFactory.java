package com.mouse.autumn.basicioc.factorybean.nonstatic;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class NonStaticBarInterfaceFactory {


    public BarInterface getInstance(){
        return new BarInterfaceImpl();
    }

}
