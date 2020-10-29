package com.elltor.designpattern.Facade;

public class Facade {
    private SubA subA = new SubA();
    private SubB subB = new SubB();
    private SubC subC = new SubC();


    public void methodOne(){
        System.out.println("执行了第一组方法.");
        subA.methodA();
        subB.methodB();
    }

    public void methodTow(){
        System.out.println("执行了第二组方法.");
        subB.methodB();
        subC.methodC();
    }
}
