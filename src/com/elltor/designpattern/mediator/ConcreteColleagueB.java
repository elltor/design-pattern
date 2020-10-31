package com.elltor.designpattern.mediator;

public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notification(String message){
        System.out.println("Colleague B 得到一个信息: "+message);
    }
}