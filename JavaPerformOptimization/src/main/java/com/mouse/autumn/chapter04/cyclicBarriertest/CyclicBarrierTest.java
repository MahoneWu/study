package com.mouse.autumn.chapter04.cyclicBarriertest;

import java.util.concurrent.CyclicBarrier;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/15
 *
 * https://blog.csdn.net/bntX2jSQfEHy7/article/details/78237208
 *
 *它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，
 * 直到最后一个线程到达屏障时，屏障才会开门，所有被屏障拦截的线程才会继续干活。
 *
 *
 *
 *
 */
public class CyclicBarrierTest {


    CyclicBarrier c = new CyclicBarrier(1);

}
