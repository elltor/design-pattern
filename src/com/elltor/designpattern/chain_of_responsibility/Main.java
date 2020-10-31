package com.elltor.designpattern.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        for(int i=1;i<=5;i++){
            handlerA.HandleRequest(i);
            System.out.println("--------------------");
        }



    }
}
