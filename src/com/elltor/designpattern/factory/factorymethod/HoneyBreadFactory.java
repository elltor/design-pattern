package com.elltor.designpattern.factory.factorymethod;

public class HoneyBreadFactory implements IFactory {
    @Override
    public BreadMaker creatMaker() {
        return new HoneyBread();
    }
}
