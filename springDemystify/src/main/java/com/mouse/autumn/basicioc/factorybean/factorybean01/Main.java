package com.mouse.autumn.basicioc.factorybean.factorybean01;

import org.joda.time.DateTime;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;


/**
 * @author wuhao Mahone Wu
 * @date 2018/6/30
 */
public class Main {


    public static void main(String[] args) {
        BeanFactory container = new ClassPathXmlApplicationContext("factorybean/factorybean01/factorybean01.xml");

        Object nextDayDate = container.getBean("nextDayDate");

        System.out.println(nextDayDate instanceof DateTime);

        Object factoryBean = container.getBean("&nextDayDate");
        System.out.println(factoryBean instanceof FactoryBean);
        System.out.println(factoryBean instanceof NextDayDateFactoryBean);


        try {
            Object factoryValue = ((FactoryBean) factoryBean).getObject();
            assertTrue(factoryValue instanceof  DateTime);
            assertNotSame(nextDayDate, factoryValue);

            int aa = ((DateTime)nextDayDate).getDayOfYear();
            System.out.println(aa);
            assertEquals(((DateTime)nextDayDate).getDayOfYear(),((DateTime)factoryValue).getDayOfYear());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
