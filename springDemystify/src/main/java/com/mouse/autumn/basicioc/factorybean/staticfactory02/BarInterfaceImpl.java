package com.mouse.autumn.basicioc.factorybean.staticfactory02;


/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class BarInterfaceImpl implements BarInterface {

    private FooBar fooBar;

    public BarInterfaceImpl(FooBar fooBar) {
        this.fooBar = fooBar;
    }
    @Override
    public void print() {
        System.out.println("BarInterfaceImpl2");
    }
}
