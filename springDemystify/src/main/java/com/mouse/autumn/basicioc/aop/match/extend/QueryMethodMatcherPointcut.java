package com.mouse.autumn.basicioc.aop.match.extend;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * Created by Mahone Wu on 2018/7/26.
 */
public class QueryMethodMatcherPointcut extends StaticMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return method.getName().startsWith("get") && targetClass.getPackage().getName().startsWith("...dao") ;
    }
}
