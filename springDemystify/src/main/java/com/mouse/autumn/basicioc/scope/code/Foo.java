package com.mouse.autumn.basicioc.scope.code;



/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class Foo {

    private Bar bar;

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Bar getBar() {
        return bar;
    }

    public void print(){
        bar.print();

    }

}
