package com.mouse.autumn.chapter02.flyweight;

/**
 * Created by Mahone Wu on 2018/8/10.
 */
public class Runner {


    public static void main(String[] args) {
        ReportManagerFactory rmf = new ReportManagerFactory();
        IReportManager rm = rmf.getFinancialReportManager("A");
        System.out.println(rm.createReport());

    }



}
