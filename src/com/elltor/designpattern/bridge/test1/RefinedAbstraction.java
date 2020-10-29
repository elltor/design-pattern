package com.elltor.designpattern.bridge.test1;

public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
