package com.mouse.autumn.basicioc.annotion.cycledemo03;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Mahone Wu on 2018/7/23.
 */
public class StudentA implements ApplicationContextAware,BeanFactoryPostProcessor,DisposableBean {

    private StudentB studentB;

    public void setStudentB(StudentB studentB) {
        this.studentB = studentB;
    }

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }

    public StudentA() {
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory------>" + beanFactory);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destory");
    }
}
