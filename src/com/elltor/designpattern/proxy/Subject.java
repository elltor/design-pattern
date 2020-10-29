package com.elltor.designpattern.proxy;

public class Subject implements ISubject {
    @Override
    public void request() {
        System.out.println("Subject的request方法执行了.");
    }
}
