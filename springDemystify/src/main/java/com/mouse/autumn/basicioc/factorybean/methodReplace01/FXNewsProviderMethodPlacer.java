package com.mouse.autumn.basicioc.factorybean.methodReplace01;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author wuhao Mahone Wu
 * @date 2018/6/30
 */
public class FXNewsProviderMethodPlacer implements MethodReplacer {


    @Override
    public Object reimplement(Object target, Method method, Object[] args) throws Throwable {

        System.out.println("before executin method [" + method.getName()+"] on Object ["
        +target.getClass().getName()+"}");

        System.out.println("sorry. we will do nothing this time");

        System.out.println("end of executing method [" + method.getName() +"] on Object ["
                +target.getClass().getName()+"]");


        return null;
    }
}
