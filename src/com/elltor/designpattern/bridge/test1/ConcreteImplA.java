package com.elltor.designpattern.bridge.test1;

public class ConcreteImplA extends Implementor {
    @Override
    public void operation() {
        System.out.println("这是ConcreteImpl类的operation()方法执行.");
    }
}
