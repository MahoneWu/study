package com.mouse.autumn.basicioc.xmldemo02.byname;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
public class Foo {

    private Bar bars;

    public Bar getBars() {
        return bars;
    }

    public void setBars(Bar bars) {
        this.bars = bars;
    }

    public void print(){
        bars.print();

    }

}
