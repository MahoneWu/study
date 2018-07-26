package com.mouse.autumn.basicioc.aop.match.annnotionmatch;

/**
 * Created by Mahone Wu on 2018/7/26.
 */
@ClassLevlAnnotation
public class GenericTargetObject {


    @MethodLevelAnnotation
    public void gMethod1(){
        System.out.println("gMethod1");
    }

    public void gMethod2(){
        System.out.println("gMethod2");
    }


}
