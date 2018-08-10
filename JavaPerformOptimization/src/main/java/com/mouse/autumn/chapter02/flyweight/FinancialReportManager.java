package com.mouse.autumn.chapter02.flyweight;

/**
 * Created by Mahone Wu on 2018/8/10.
 */
public class FinancialReportManager implements IReportManager {

    protected String tenantId = null;


    public FinancialReportManager(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "this is a financial report";
    }
}
