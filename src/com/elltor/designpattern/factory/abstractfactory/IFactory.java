package com.elltor.designpattern.factory.abstractfactory;

public interface IFactory {
    BreadMaker creatBreadMaker();
    PizzaMaker creatPizzaMaker();
}
