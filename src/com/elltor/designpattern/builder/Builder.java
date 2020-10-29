package com.elltor.designpattern.builder;

public abstract class Builder {
    public abstract void BuildPartA();
    public abstract void BuildPartB();

    public abstract Product getResult();

}
