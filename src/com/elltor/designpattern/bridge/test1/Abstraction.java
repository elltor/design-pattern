package com.elltor.designpattern.bridge.test1;

public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor impl) {
        this.implementor = impl;
    }

    public void operation() {
        implementor.operation();
    }
}
