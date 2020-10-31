package com.elltor.designpattern.visitor.report_demo;

public interface Leader {
    void visitFinancialReport(FinancialReport report);
    void visitLogisticsReport(LogisticsReport report);
}
