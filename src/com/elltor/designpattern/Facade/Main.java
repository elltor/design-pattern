package com.elltor.designpattern.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodOne();
        System.out.println("--------------------");
        facade.methodTow();
    }
}

