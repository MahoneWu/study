package com.mouse.autumn.basicioc.aop.test.introduction;

/**
 * Created by Mahone Wu on 2018/7/27.
 */
public class Tester implements ITester {

    private boolean busyAsTester;

    @Override
    public boolean isBuyAsTester() {
        return false;
    }

    @Override
    public void testSoftware() {
        System.out.println("I will ensure the quality");
    }


    public void setBusyAsTester(boolean busyAsTester) {
        this.busyAsTester = busyAsTester;
    }
}
