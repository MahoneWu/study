package com.mouse.autumn.basicioc.aop.match.controlflowmatch;

/**
 * Created by Mahone Wu on 2018/7/26.
 */
public class TargetCaller {

    private TargetObject targetObject;

    public void callMethod(){
        targetObject.method1();
    }

    public void setTargetObject(TargetObject targetObject) {
        this.targetObject = targetObject;
    }
}
