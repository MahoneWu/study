package com.mouse.autumn.basicioc.jdbc;

/**
 * Created by Mahone Wu on 2018/7/31.
 */
public class VehicleMT extends Vehicle {

    @Override
    protected void putIntoGear() {
        System.out.println("踩离合器");
        System.out.println("挂前进档位");
    }
}
