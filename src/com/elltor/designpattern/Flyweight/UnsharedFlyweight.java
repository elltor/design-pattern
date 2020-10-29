package com.elltor.designpattern.Flyweight;

public class UnsharedFlyweight implements Flyweight {
    @Override
    public void operation(int i) {
        System.out.println("不被共享的享元对象: "+i);
    }
}
