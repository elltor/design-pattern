package com.elltor.designpattern.observer;

public class ConcreteObserver extends Observer {
    private String observerName;
    private String state;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String observerName, ConcreteSubject concreteSubject) {
        this.observerName = observerName;
        this.concreteSubject = concreteSubject;
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    void update() {
        state = concreteSubject.getState();
        System.out.println(observerName+" 观察到的是: "+state);
    }
}
