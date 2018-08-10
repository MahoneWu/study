package com.mouse.autumn.chapter02.flyweight;

/**
 * Created by Mahone Wu on 2018/8/10.
 */
public class EmployeeReportManager implements IReportManager {


    protected String tenantId = null;


    public EmployeeReportManager(String tenantId) {
        this.tenantId = tenantId;
    }


    @Override
    public String createReport() {
        return "THIS IS A employee report";
    }
}
