package com.elltor.designpattern.visitor.report_demo;

public class LogisticsReport implements Reporter{
    private int production = 500;
    private int sale = 300;

    @Override
    public void accept(Leader leader) {
        leader.visitLogisticsReport(this);
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }
}
