package com.elltor.designpattern.visitor.report_demo;

public class FinanceDirector implements Leader{

    @Override
    public void visitFinancialReport(FinancialReport report) {
        int inCome = report.getInCome()-report.getCost();
        System.out.println("根据财务报表, 总收入为: "+inCome);
    }

    @Override
    public void visitLogisticsReport(LogisticsReport report) {
        // 不关心销售
    }
}
