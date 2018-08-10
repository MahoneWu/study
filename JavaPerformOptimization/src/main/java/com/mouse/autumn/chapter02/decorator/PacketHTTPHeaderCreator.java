package com.mouse.autumn.chapter02.decorator;

/**
 * @Title: PacketHTMLHeaderCreator
 * @Package com.mouse.autumn.chapter02.decorator
 * @Description: 具体装饰器，它负责对核心发布的内容进行HTML格式化操作。特别注意，它委托了具体组件component进行核心业务处理
 * @author Mahone Wu
 * @date 2018/8/10 16:11
 * @version V1.0
 */
public class PacketHTTPHeaderCreator extends PacketDecorator {

    public PacketHTTPHeaderCreator(IPacketCreator component) {
        super(component);
    }

    @Override
    public String handleContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cache-Control:no-cache\n");
        sb.append("Date:Mon,31 Dec201204:25:57GMT\n");
        sb.append(component.handleContent());
        return sb.toString();
    }
}
