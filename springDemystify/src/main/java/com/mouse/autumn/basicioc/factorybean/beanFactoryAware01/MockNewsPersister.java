package com.mouse.autumn.basicioc.factorybean.beanFactoryAware01;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author wuhao Mahone Wu
 * @date 2018/6/30
 */
public class MockNewsPersister implements IFXNewsPersister,BeanFactoryAware {


    private BeanFactory beanFactory;





    public FXNewsBean getFxNewsBean() {
        return (FXNewsBean)beanFactory.getBean("newsBean");
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


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
