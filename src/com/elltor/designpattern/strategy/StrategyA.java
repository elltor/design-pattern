package com.elltor.designpattern.strategy;

public class StrategyA implements Strategy {
    @Override
    public void Algorithm() {
        System.out.println("使用了StrategyA的算法");
    }
}
