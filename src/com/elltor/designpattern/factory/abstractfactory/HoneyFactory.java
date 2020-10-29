package com.elltor.designpattern.factory.abstractfactory;


public class HoneyFactory implements IFactory {
    @Override
    public BreadMaker creatBreadMaker() {
        return new HoneyBread();
    }

    @Override
    public PizzaMaker creatPizzaMaker() {
        return new HoneyPizza();
    }
}
