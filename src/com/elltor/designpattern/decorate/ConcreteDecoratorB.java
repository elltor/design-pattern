package com.elltor.designpattern.decorate;


public class ConcreteDecoratorB extends Decorator {
    String info = "ConcreteDecoratorB";

    @Override
    public void operate() {
        super.operate();
        System.out.println("装饰一下..............");
        System.out.println("info: "+info);
    }
}

