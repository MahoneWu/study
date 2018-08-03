package com.mouse.autumn.basicioc.jdbc.tranctest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mahone Wu on 2018/8/2.
 */
public class Runner {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc/datasource.xml");

        QuoteServiceClient client = (QuoteServiceClient) context.getBean("client");
       // ((QuoteService)context.getBean("quoteService")).saveQuote(null);
        //client.test();


        try {
            String count = 1 + "";
            System.out.println(new Quote().getCount() == Integer.valueOf(count).intValue());
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(e);
        }




    }

}
