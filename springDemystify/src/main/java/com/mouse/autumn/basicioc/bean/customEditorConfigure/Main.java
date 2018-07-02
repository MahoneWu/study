package com.mouse.autumn.basicioc.bean.customEditorConfigure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuhao Mahone Wu
 * @date 2018/7/1
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("bean/customEditorConfigure/customEditorConfigure.xml");

        Person person = (Person) container.getBean("person");

        System.out.println(person.getBirthday());


    }

}
