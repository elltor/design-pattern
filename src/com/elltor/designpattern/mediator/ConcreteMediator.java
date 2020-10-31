package com.elltor.designpattern.mediator;

public class ConcreteMediator implements Mediator{
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;


    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == colleagueA){
            colleagueB.notification(message);
        }else{
            colleagueA.notification(message);
        }
    }

    public ConcreteColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ConcreteColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
