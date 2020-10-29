package com.elltor.designpattern.decorate;

public class Main {

    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        System.out.println("未装饰前");
        cc.operate();

        System.out.println("\n--------------------");

        System.out.println("A装饰后");
        ConcreteDecoratorA A = new ConcreteDecoratorA();
        A.setComponent(cc);
        A.operate();

        System.out.println("\n--------------------");
        System.out.println("B装饰后");
        ConcreteDecoratorA B = new ConcreteDecoratorA();
        B.setComponent(cc);
        B.operate();
    }
}
