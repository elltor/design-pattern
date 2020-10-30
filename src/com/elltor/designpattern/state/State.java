package com.elltor.designpattern.state;


public abstract class State {
    public String stateName;
    public abstract void handle(Context context);
}
