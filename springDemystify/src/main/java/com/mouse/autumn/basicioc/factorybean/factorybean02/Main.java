package com.mouse.autumn.basicioc.factorybean.factorybean02;

import com.alibaba.dubbo.config.ApplicationConfig;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @Description:偷梁换柱之方法注入
* @ClassName:Main
* @author:Mahone Wu
* @date:2018/6/30 下午3:18
*/
public class Main {


    /**
    * @Description:通过look-up,每次调用都让容器返回新的对象实例
    * @ClassName:Main
    * @author:Mahone Wu
    * @date:2018/6/30 下午3:19
    */
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("factorybean/factorybean02/factorybean02.xml");
        MockNewsPersister persister = (MockNewsPersister)container.getBean("mockPersister");
        persister.persistNews();
        persister.persistNews();

    }


}
