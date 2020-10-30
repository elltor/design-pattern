package com.elltor.designpattern.state;

public class ConcreteStateB extends State{
    public ConcreteStateB() {
        stateName = "状态B";
    }

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
