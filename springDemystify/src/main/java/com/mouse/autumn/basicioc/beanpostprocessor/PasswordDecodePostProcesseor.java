package com.mouse.autumn.basicioc.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Title: PasswordDecodePostProcesseor
 * @Package com.mouse.autumn.basicioc.beanpostprocessor
 * @Description: postProcessAfterInitialization和postProcessBeforeInitialization均不能返回null,否则getBean的对象返回空
 * @author Mahone Wu
 * @date 2018/7/2 20:04
 * @version V1.0
 */
public class PasswordDecodePostProcesseor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof PasswordDecodable){
            String encodedPassword = ((PasswordDecodable) bean).getEncodedPassword();
            String decodedPassword = decodedPassword(encodedPassword);
            ((PasswordDecodable)bean).setDecodedPassword(decodedPassword);
        }
            return bean;
    }

    private String decodedPassword(String encodedPassword) {
        return "123456";
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
