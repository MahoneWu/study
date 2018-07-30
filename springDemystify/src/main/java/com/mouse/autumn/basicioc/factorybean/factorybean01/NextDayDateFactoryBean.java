package com.mouse.autumn.basicioc.factorybean.factorybean01;

import org.joda.time.DateTime;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author wuhao Mahone Wu
 * @date 2018/6/30
 */
public class NextDayDateFactoryBean implements FactoryBean {


    @Override
    public Object getObject() throws Exception {
        return new DateTime().plusDays(1);
    }

    @Override
    public Class<?> getObjectType() {
        return DateTime.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
