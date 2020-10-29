package com.elltor.designpattern.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        BreadMaker breadMaker;

        breadMaker = BreadFactory.makeBread(0);
        breadMaker.getBread();

        breadMaker = BreadFactory.makeBread(1);
        breadMaker.getBread();
    }
}
