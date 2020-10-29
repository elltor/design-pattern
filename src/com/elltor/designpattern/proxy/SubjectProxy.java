package com.elltor.designpattern.proxy;

public class SubjectProxy implements ISubject {
    private ISubject subject = new Subject();

    @Override
    public void request() {
        System.out.println("代理类SubjectProxy的request方法执行了.");
        subject.request();
    }
}
