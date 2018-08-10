package com.mouse.autumn.chapter02.decorator;

/**
 * @Title: PacketBodyCreator
 * @Package com.mouse.autumn.chapter02.decorator
 * @Description: 具体组件,它的功能是构造要发布信息的核心内容，但是它不负责将其构造成一个格式工整、可直接发布的数据格式
 * @author Mahone Wu
 * @date 2018/8/10 16:03
 * @version V1.0
 */
public class PacketBodyCreator implements IPacketCreator {


    @Override
    public String handleContent() {//构造核心数据,但不包括格式
        return "Content of Packet";
    }
}
