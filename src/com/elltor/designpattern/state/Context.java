package com.elltor.designpattern.state;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {

        System.out.println("当前状态为: "+this.state.stateName);
        this.state = state;
        System.out.println("状态变更为: "+this.state.stateName);
        System.out.println("--------------------");
    }

    public void request(){
        state.handle(this);
    }
}
