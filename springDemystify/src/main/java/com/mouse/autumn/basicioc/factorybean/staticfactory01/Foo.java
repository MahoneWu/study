package com.mouse.autumn.basicioc.factorybean.staticfactory01;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class Foo {

    private BarInterface barInterface;

/*    public Foo(BarInterface barInterface) {
        this.barInterface = barInterface;
    }*/

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
