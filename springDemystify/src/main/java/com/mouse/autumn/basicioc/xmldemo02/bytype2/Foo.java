package com.mouse.autumn.basicioc.xmldemo02.bytype2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mahone Wu on 2018/6/29.
 */
@Service("foo")
public class Foo {

    /*@Autowired
    private Bar bar1;

    public Bar getBar1() {
        return bar1;
    }

    public void setBar1(Bar bar1) {
        this.bar1 = bar1;
    }

    public void print(){
        bar1.printf("132");
    }*/

    @Autowired
    private Bar bar;

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void print(){
        bar.printf("132");

    }


}
