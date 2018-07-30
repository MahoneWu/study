package com.mouse.autumn.basicioc.factorybean.methodReplace01;

import org.apache.commons.lang.ArrayUtils;

/**
 * @Title: FXNewsProvider
 * @Package com.mouse.autumn.basicioc
 * @Description: 抓取新闻并入库
 * @author Mahone Wu
 * @date 2018/6/27 14:49
 * @version V1.0
 */
public class FXNewsProvider {

    private IFXNewsListener newsListener;

    private IFXNewsPersister newsPersister;


    public FXNewsProvider(IFXNewsListener newsListener, IFXNewsPersister newsPersister) {
        this.newsListener = newsListener;
        this.newsPersister = newsPersister;
    }

    public void getAndPersistener(){
        String[] newsIds = {"123","456"};
        if (ArrayUtils.isEmpty(newsIds)) {
            return;
        }
        for (String newsId : newsIds) {
            FXNewsBean newsBean = newsListener.getNewsByPK(newsId);
            newsPersister.persistNews(newsBean);
            newsListener.postProcessIfNecessary(newsId);
        }
    }





}
