package com.mouse.autumn.chapter02.decorator;

/**
 * @Title: PacketDecorator
 * @Package com.mouse.autumn.chapter02.decorator
 * @Description: PacketDecorator维护核心组件component对象，它负责告知其子类，其核心业务逻辑全权委托component完成，自己仅仅是做增强处理
 * @author Mahone Wu
 * @date 2018/8/10 16:09
 * @version V1.0
 */
public abstract class PacketDecorator implements IPacketCreator {

    IPacketCreator component;

    public PacketDecorator(IPacketCreator component) {
        this.component = component;
    }
}
