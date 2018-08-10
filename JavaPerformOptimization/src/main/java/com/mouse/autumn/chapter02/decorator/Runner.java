package com.mouse.autumn.chapter02.decorator;

/**
 * Created by Mahone Wu on 2018/8/10.
 */
public class Runner {


    public static void main(String[] args) {
        IPacketCreator pc = new PacketHTTPHeaderCreator(new PacketHTMLHeaderCreator(new PacketBodyCreator()));

        System.out.println(pc.handleContent());

    }



}
