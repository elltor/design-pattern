package com.elltor.designpattern.signalton.lazy;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton instance has init.");

    }

    public static Singleton getInstance(){
        return instance;
    }

    public void find(){
        //do operate
        System.out.println("you do a find operate.");

    }
}
