package com.mouse.autumn.basicioc.factorybean.methodReplace01;

/**
 * Created by Mahone Wu on 2018/6/27.
 */
public class DowJonesNewsListener implements IFXNewsListener {


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
}
