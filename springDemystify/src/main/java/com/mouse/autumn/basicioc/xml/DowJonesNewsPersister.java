package com.mouse.autumn.basicioc.xml;

/**
 * Created by Mahone Wu on 2018/6/27.
 */
public class DowJonesNewsPersister implements IFXNewsPersister {

    @Override
    public void persistNews(FXNewsBean newsBean) {
        System.out.println("xml-persistNews");
    }
}


