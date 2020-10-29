package com.elltor.designpattern.builder;


/**
 * 指挥者
 */
public class Director {
    public void construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }

}
