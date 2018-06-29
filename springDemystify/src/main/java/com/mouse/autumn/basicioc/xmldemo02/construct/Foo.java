package com.mouse.autumn.basicioc.xmldemo02.construct;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class Foo {

    private Bar bar;

    public Foo(Bar arg) {
        this.bar = arg;
    }


    public void print(){
        bar.print();

    }

}
