package com.elltor.designpattern.strategy;

public class Context{
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextOperate(){
        this.strategy.Algorithm();
    }
}
