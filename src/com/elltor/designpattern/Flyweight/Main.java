package com.elltor.designpattern.Flyweight;

public class Main {
    public static void main(String[] args) {
        int i = 100;
        FlyweightFcatory factory = new FlyweightFcatory();

        Flyweight flyweightA = factory.getFlyweight("A");
        flyweightA.operation(i);

        Flyweight flyweightB = factory.getFlyweight("B");
        flyweightB.operation(i*2);

        Flyweight flyweightC = factory.getFlyweight("C");
        flyweightC.operation(i*3);

        Flyweight flyweightD = factory.getFlyweight("D");
        flyweightD.operation(i*4);

        Flyweight flyweightE = factory.getFlyweight("E");
        flyweightE.operation(i*5);
    }

}
