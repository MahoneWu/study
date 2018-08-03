package com.mouse.autumn.basicioc.jdbc.abst;

/**
 * Created by Mahone Wu on 2018/7/31.
 */
public abstract class Vehicle {


    public final void drive(){
        startTheEngine();

        putIntoGear();

        looseHandBrake();

        stepOnTheGasAndGo();

    }



    protected abstract void putIntoGear();

    private void stepOnTheGasAndGo() {

    }

    private void looseHandBrake() {

    }

    private void startTheEngine(){

    }



}
