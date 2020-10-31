package com.elltor.designpattern.visitor.report_demo;

public class SalesDirector implements Leader {

    @Override
    public void visitFinancialReport(FinancialReport report) {
        // 不关心财务报表
    }

    @Override
    public void visitLogisticsReport(LogisticsReport report) {
        int stock = report.getProduction() - report.getSale();
        System.out.println("根据销售表, 当前库存为: " + stock);
    }
}
