package com.elltor.designpattern.strategy;


public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new StrategyA());
        context.contextOperate();

        context = new Context(new StrategyB());
        context.contextOperate();
    }
}
