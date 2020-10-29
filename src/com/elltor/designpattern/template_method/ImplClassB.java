package com.elltor.designpattern.template_method;

public class ImplClassB extends AbstractClass {
    @Override
    void methodA() {
        System.out.println("ClassB的methodA方法执行了");
    }

    @Override
    void methodB() {
        System.out.println("ClassB的methodB方法执行了");
    }

    @Override
    void methodC() {
        System.out.println("ClassB的methodA方法执行了");
    }
}