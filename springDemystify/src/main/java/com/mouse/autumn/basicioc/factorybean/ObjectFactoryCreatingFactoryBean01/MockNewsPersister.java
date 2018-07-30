package com.mouse.autumn.basicioc.factorybean.ObjectFactoryCreatingFactoryBean01;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.ObjectFactory;

/**
 * @author wuhao Mahone Wu
 * @date 2018/6/30
 */
public class MockNewsPersister implements IFXNewsPersister {


    private ObjectFactory objectFactory;

    public void setObjectFactory(ObjectFactory objectFactory) {
        this.objectFactory = objectFactory;
    }

    public FXNewsBean getFxNewsBean() {
        return (FXNewsBean)objectFactory.getObject();
    }


    @Override
    public void persistNews(FXNewsBean newsBean) {
        persistNewes();
    }

    private void persistNewes() {


    }

    public void persistNews() {
        System.out.println("persist bean:"+getFxNewsBean());
    }


}
