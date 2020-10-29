package com.elltor.designpattern.factory.abstractfactory;

import com.elltor.designpattern.factory.abstractfactory.BreadMaker;

public class BlackBread extends BreadMaker {

    // 重写
    @Override
    public void getBread() {
        System.out.println("考出黑面包");
    }
}
