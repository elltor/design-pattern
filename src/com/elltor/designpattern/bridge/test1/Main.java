package com.elltor.designpattern.bridge.test1;

public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplB());
        abstraction.operation();



    }
}
