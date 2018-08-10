package com.mouse.autumn.chapter02.decorator;

/**
 * @Title: PacketHTMLHeaderCreator
 * @Package com.mouse.autumn.chapter02.decorator
 * @Description: 具体装饰器，它负责对核心发布的内容进行HTML格式化操作。特别注意，它委托了具体组件component进行核心业务处理
 * @author Mahone Wu
 * @date 2018/8/10 16:11
 * @version V1.0
 */
public class PacketHTMLHeaderCreator extends PacketDecorator {

    public PacketHTMLHeaderCreator(IPacketCreator component) {
        super(component);
    }

    @Override
    public String handleContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body>");
        sb.append(component.handleContent());
        sb.append("</body>");
        sb.append("</html>\n");
        return sb.toString();
    }
}
