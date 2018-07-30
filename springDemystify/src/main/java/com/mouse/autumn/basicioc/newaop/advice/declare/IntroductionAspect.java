package com.mouse.autumn.basicioc.newaop.advice.declare;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by Mahone Wu on 2018/7/30.
 */
@Aspect
public class IntroductionAspect {


    @DeclareParents(value = "com.mouse.autumn.basicioc.newaop.advice.declare.TaskImpl"
                    ,defaultImpl =CountImpl.class )
    public ICounter counter;


}
