package com.elltor.designpattern.decorate;

public class ConcreteDecoratorA extends Decorator {
    String info = "ConcreteDecoratorA";


    // 并不太好
    @Override
    public void operate() {
        super.operate();
        System.out.println("装饰一下..............");
        System.out.println("info: "+info);
    }
}
