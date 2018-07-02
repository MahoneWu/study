package com.mouse.autumn.basicioc.factorybean.factorybean02;


/**
 * @author wuhao Mahone Wu
 * @date 2018/6/30
 */
public class MockNewsPersister implements IFXNewsPersister {


    private FXNewsBean fxNewsBean;


    public FXNewsBean getFxNewsBean() {
        return fxNewsBean;
    }

    public void setFxNewsBean(FXNewsBean fxNewsBean) {
        this.fxNewsBean = fxNewsBean;
    }

    @Override
    public void persistNews(FXNewsBean newsBean) {
        persistNewes();
    }

    private void persistNewes() {


    }

    public void persistNews() {
        System.out.println("persist bean:"+getFxNewsBean());
    }


}
