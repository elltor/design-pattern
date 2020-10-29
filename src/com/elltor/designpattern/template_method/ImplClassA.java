package com.elltor.designpattern.template_method;

public class ImplClassA extends AbstractClass {
    @Override
    void methodA() {
        System.out.println("ClassA的methodA方法执行了");
    }

    @Override
    void methodB() {
        System.out.println("ClassA的methodB方法执行了");
    }

    @Override
    void methodC() {
        System.out.println("ClassA的methodA方法执行了");
    }
}
