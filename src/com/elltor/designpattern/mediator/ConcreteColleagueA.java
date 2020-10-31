package com.elltor.designpattern.mediator;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notification(String message){
        System.out.println("Colleague A 得到一个信息: "+message);
    }
}
