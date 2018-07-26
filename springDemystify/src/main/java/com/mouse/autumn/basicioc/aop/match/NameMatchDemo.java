package com.mouse.autumn.basicioc.aop.match;

import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * Created by Mahone Wu on 2018/7/25.
 */
public class NameMatchDemo {


    public static void main(String[] args) {
        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();

        pointcut.setMappedName("matches");

        pointcut.setMappedNames(new String[]{"matches","isRuntime"});

    }

}
