package com.elltor.designpattern.factory.abstractfactory;

import com.elltor.designpattern.factory.abstractfactory.BreadMaker;

public class HoneyBread extends BreadMaker {
    @Override
    public void getBread() {
        System.out.println("烤出蜂蜜面包");
    }
}
