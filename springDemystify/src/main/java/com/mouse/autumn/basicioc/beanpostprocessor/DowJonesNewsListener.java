package com.mouse.autumn.basicioc.beanpostprocessor;

import com.mouse.autumn.basicioc.xml.FXNewsBean;
import com.mouse.autumn.basicioc.xml.IFXNewsListener;

/**
 * Created by Mahone Wu on 2018/6/27.
 */
public class DowJonesNewsListener implements IFXNewsListener,PasswordDecodable {

    private String password;


    @Override
    public String[] getAvailableNewsIds() {
        return new String[0];
    }

    @Override
    public FXNewsBean getNewsByPK(String newsId) {
        System.out.println("----" + newsId);
        return null;
    }

    @Override
    public void postProcessIfNecessary(String newsId) {
        System.out.println("postProcessIfNecessary");
    }


    @Override
    public String getEncodedPassword() {
        return this.password;
    }

    @Override
    public void setDecodedPassword(String password) {
        this.password = password;
    }
}
