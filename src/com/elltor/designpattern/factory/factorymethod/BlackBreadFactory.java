package com.elltor.designpattern.factory.factorymethod;

public class BlackBreadFactory implements IFactory{
    @Override
    public BreadMaker creatMaker() {
        return new BlackBread();
    }
}
