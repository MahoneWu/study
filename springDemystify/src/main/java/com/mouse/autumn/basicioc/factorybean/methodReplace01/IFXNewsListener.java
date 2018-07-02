package com.mouse.autumn.basicioc.factorybean.methodReplace01;

/**
 * Created by Mahone Wu on 2018/6/27.
 */
public interface IFXNewsListener {


      String[] getAvailableNewsIds();

      FXNewsBean getNewsByPK(String newsId);

      void postProcessIfNecessary(String newsId);
}
