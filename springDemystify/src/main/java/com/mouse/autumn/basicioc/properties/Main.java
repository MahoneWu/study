package com.mouse.autumn.basicioc.properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.util.Properties;

/**
 * Created by Mahone Wu on 2018/8/8.
 */
public class Main {


    public static void main(String[] args) {

        try {
            Properties properties = new Properties();

            /*properties.load(new FileInputStream("com\\mouse\\autumn\\basicioc\\properties\\database.properties"));*/
            /*properties.load(new FileInputStream("com/mouse/autumn/basicioc/properties/database.properties"));*/

         /*   InputStream inputStream = Main.class.getResourceAsStream("\\com\\mouse\\autumn\\basicioc\\properties\\database.properties");
            properties.load(inputStream);*/

            properties = PropertiesLoaderUtils.loadAllProperties("com/mouse/autumn/basicioc/properties/database.properties");


            //properties.list(System.out);

            System.out.println(properties.getProperty("name"));

        }catch (Exception e){
            e.printStackTrace();
        }


    }


}
