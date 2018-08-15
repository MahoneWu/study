package com.mouse.autumn.chapter04.deadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Mahone Wu on 2018/8/15.
 */
public class DeadLockCar extends Thread {

    private Object myDirect;


    static ReentrantLock south = new ReentrantLock();
    static ReentrantLock north = new ReentrantLock();
    static ReentrantLock west = new ReentrantLock();
    static ReentrantLock east = new ReentrantLock();


    public DeadLockCar(Object obj){
        this.myDirect = obj;
        if(myDirect == south){
            this.setName("south");
        }
        if(myDirect==north){
            this.setName("north");
        }
        if(myDirect == west){
            this.setName("west");
        }
        if(myDirect == east){
            this.setName("ease");
        }
    }

    @Override
    public void run() {

        if(myDirect == south){//向南走的车
            try {
                west.lockInterruptibly();//占据向西的路
                Thread.sleep(1000);
                south.lockInterruptibly();
                System.out.println("car to south has passed");
            }catch (InterruptedException e){
                System.out.println("car to south is killed");
            }finally {
                if(west.isHeldByCurrentThread()){
                    west.unlock();
                }
                if(south.isHeldByCurrentThread()){
                    south.unlock();
                }
            }
        }

        if(myDirect == north){//向北走的车
            try {
                east.lockInterruptibly();//占据向东的路
                Thread.sleep(1000);
                north.lockInterruptibly();
                System.out.println("car to nouth has passed");
            }catch (InterruptedException e){
                System.out.println("car to nouth is killed");
            }finally {
                if(north.isHeldByCurrentThread()){
                    north.unlock();
                }
                if(east.isHeldByCurrentThread()){
                    east.unlock();
                }
            }
        }

        if(myDirect == west){//向西走的车
            try {
                north.lockInterruptibly();//占据向北的路
                Thread.sleep(1000);
                west.lockInterruptibly();
                System.out.println("car to west has passed");
            }catch (InterruptedException e){
                System.out.println("car to west is killed");
            }finally {
                if(north.isHeldByCurrentThread()){
                    north.unlock();
                }
                if(west.isHeldByCurrentThread()){
                    west.unlock();
                }
            }
        }

        if(myDirect == east){//向东走的车
            try {
                south.lockInterruptibly();//占据向南的路
                Thread.sleep(1000);
                east.lockInterruptibly();
                System.out.println("car to east has passed");
            }catch (InterruptedException e){
                System.out.println("car to east is killed");
            }finally {
                if(south.isHeldByCurrentThread()){
                    south.unlock();
                }
                if(east.isHeldByCurrentThread()){
                    east.unlock();
                }
            }
        }

    }


    public static void main(String[] args) throws InterruptedException {
        DeadLockCar car2south = new DeadLockCar(south);
        DeadLockCar car2north = new DeadLockCar(north);
        DeadLockCar car2west = new DeadLockCar(west);
        DeadLockCar car2east = new DeadLockCar(east);

        car2south.start();
        car2north.start();
        car2west.start();
        car2east.start();


        Thread.sleep(10000);

        car2north.interrupt();

    }


}
