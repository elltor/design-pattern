package com.elltor.designpattern.factory.simplefactory;

public class BlackBread extends BreadMaker {
    // 重写
    @Override
    public void getBread() {
        System.out.println("考出黑面包");
    }
}
