package com.elltor.designpattern.template_method;

public abstract class AbstractClass {
    abstract void methodA();

    abstract void methodB();

    abstract void methodC();

    void executeTemplateMethod() {
        methodA();
        methodB();
        methodC();
    }
}
