package com.mouse.autumn.basicioc.messagesource.demo01;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * Created by Mahone Wu on 2018/7/18.
 *
 * page 106
 */
public class Main {


    public static void main(String[] args) {
        MessageSource messageSource = new ClassPathXmlApplicationContext("/messagesource/demo01.xml");
        String message = messageSource.getMessage("message", null, "default", Locale.US);
        String file = messageSource.getMessage("file", new Object[]{"F"}, "default", Locale.US);
        System.out.println("====="+message+"===file="+file);
    }
}
