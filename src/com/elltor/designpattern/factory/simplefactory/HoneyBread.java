package com.elltor.designpattern.factory.simplefactory;

public class HoneyBread extends BreadMaker {
    @Override
    public void getBread() {
        System.out.println("烤出蜂蜜面包");
    }
}
