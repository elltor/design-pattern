package com.elltor.designpattern.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        HoneyFactory honeyFactory = new HoneyFactory();


        BreadMaker breadMaker;
        breadMaker = honeyFactory.creatBreadMaker();

        PizzaMaker pizzaMaker;
        pizzaMaker = honeyFactory.creatPizzaMaker();

        breadMaker.getBread();
        pizzaMaker.getPizza();
    }
}
