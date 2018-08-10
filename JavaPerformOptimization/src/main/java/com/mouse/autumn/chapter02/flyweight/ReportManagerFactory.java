package com.mouse.autumn.chapter02.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mahone Wu on 2018/8/10.
 */
public class ReportManagerFactory {

    Map<String, IReportManager> financialReportManager = new HashMap<>();

    Map<String, IReportManager> employeeReportManager = new HashMap<>();



    IReportManager getFinancialReportManager(String telnetId){
        IReportManager r = financialReportManager.get(telnetId);
        if(r == null){
            r = new FinancialReportManager(telnetId);
            financialReportManager.put(telnetId, r);
        }
        return r;
    }


    IReportManager getEmployeeReportManager(String telnetId) {
        IReportManager r = employeeReportManager.get(telnetId);
        if (r == null) {
            r = new EmployeeReportManager(telnetId);
            employeeReportManager.put(telnetId, r);
        }
        return r;
    }




}
