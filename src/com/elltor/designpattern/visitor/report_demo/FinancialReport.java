package com.elltor.designpattern.visitor.report_demo;

/**
 * 财务总监
 */
public class FinancialReport implements Reporter {
    private int inCome = 1000;//收入
    private int cost = 500;//花费

    @Override
    public void accept(Leader leader) {
        leader.visitFinancialReport(this);
    }

    public int getInCome() {
        return inCome;
    }

    public void setInCome(int inCome) {
        this.inCome = inCome;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
