package com.mouse.autumn.basicioc.applicationcontextdemo.resource;

import org.springframework.core.io.*;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Mahone Wu on 2018/7/3.
 */
public class Main {

    public static void main(String[] args) {

       // ResourceLoader resourceLoader = new DefaultResourceLoader();
        ResourceLoader resourceLoader = new FileSystemResourceLoader();

        Resource fakeFileResource = resourceLoader.getResource("D:/1.txt");

        System.out.println(fakeFileResource instanceof ClassPathResource);
        System.out.println(fakeFileResource.exists());

        Resource urlResource = resourceLoader.getResource("file:D://1.txt");
        System.out.println(urlResource instanceof UrlResource);

        Resource urlResource2 = resourceLoader.getResource("http://www.spring21.cn");
        System.out.println(urlResource2 instanceof UrlResource);

        try {
            fakeFileResource.getFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file = urlResource.getFile();
            System.out.println("---"+file.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }


        String[] date = buidDateParams("2018-07-05");
        System.out.println(date);




    }

    private static String[] buidDateParams(String startTime) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date start = sdf.parse(startTime);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(start);
            calendar.add(Calendar.DATE, 1);
            Date end = calendar.getTime();
            return new String[]{startTime, sdf.format(end)};
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
