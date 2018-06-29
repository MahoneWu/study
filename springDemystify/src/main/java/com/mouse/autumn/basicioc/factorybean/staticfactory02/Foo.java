package com.mouse.autumn.basicioc.factorybean.staticfactory02;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class Foo {

    private BarInterface barInterface;


    public BarInterface getBarInterface() {
        return barInterface;
    }

    public void setBarInterface(BarInterface barInterface) {
        this.barInterface = barInterface;
    }

    public void print(){
        barInterface.print();
    }



}
