package com.mouse.autumn.basicioc.aop.test.introduction;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class Developer  implements IDeveloper{


    @Override
    public void developSoftware() {
        System.out.println("I am happy with programming");
    }
}
