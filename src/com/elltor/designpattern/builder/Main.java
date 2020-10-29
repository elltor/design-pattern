package com.elltor.designpattern.builder;

public class Main {
    public static void main(String[] args) {
        //init
        Builder builderA = new CreateBuilderA();
        Builder builderB = new CreateBuilderB();
        Director director = new Director();

        //指挥构建A
        director.construct(builderA);
        Product prodA = builderA.getResult();
        prodA.show();

        //指挥构建B
        director.construct(builderB);
        Product prodB = builderB.getResult();
        prodB.show();


    }
}
