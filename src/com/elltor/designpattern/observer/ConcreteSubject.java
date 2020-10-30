package com.elltor.designpattern.observer;

//具体的通知类
public class ConcreteSubject  extends Subject{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
