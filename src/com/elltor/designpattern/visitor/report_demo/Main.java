package com.elltor.designpattern.visitor.report_demo;

public class Main {
    public static void main(String[] args) {
        ReportManager reportManager = new ReportManager();
        reportManager.attach(new FinancialReport());
        reportManager.attach(new LogisticsReport());

        FinanceDirector financeDirector = new FinanceDirector();
        SalesDirector salesDirector = new SalesDirector();

        reportManager.accept(financeDirector);
        reportManager.accept(salesDirector);




    }
}
