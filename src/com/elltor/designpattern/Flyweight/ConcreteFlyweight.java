package com.elltor.designpattern.Flyweight;

public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation(int i) {
        System.out.println("具体的享元对象: "+i);
    }
}
