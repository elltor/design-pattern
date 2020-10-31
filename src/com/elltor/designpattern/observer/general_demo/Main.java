package com.elltor.designpattern.observer.general_demo;

public class Main {
    public static void main(String[] args) {
        // 被观察的对象
        ConcreteSubject concreteSubject = new ConcreteSubject();

        // 设置通知的观察者, 每当concreteSubject改变, 就通知他们
        concreteSubject.attach(new ConcreteObserver("1号观察者", concreteSubject));
        concreteSubject.attach(new ConcreteObserver("2号观察者", concreteSubject));
        concreteSubject.attach(new ConcreteObserver("3号观察者", concreteSubject));

        // 被观察对象状态改变
        concreteSubject.setState("sleeping");

        // 通知观察者(Observer)
        concreteSubject.notifySubject();
    }
}