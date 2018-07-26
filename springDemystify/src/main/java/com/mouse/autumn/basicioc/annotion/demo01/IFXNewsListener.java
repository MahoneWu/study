package com.mouse.autumn.basicioc.annotion.demo01;

import com.mouse.autumn.basicioc.xml.FXNewsBean;

/**
 * Created by Mahone Wu on 2018/6/27.
 */
public interface IFXNewsListener {


      String[] getAvailableNewsIds();

      FXNewsBean getNewsByPK(String newsId);

      void postProcessIfNecessary(String newsId);
}
