package com.elltor.designpattern.state;

public class ConcreteStateA extends State {
    public ConcreteStateA(){
        stateName = "状态A";
    }

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}

