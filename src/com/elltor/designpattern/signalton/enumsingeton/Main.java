package com.elltor.designpattern.signalton.enumsingeton;

public class Main {
    static EnumSingleton ins;

    public static void main(String[] args) {

        new Thread(() -> {
            ins = EnumSingleton.instance;
            ins.find();
        }).start();

        new Thread(() -> {
            ins = EnumSingleton.instance;
            ins.find();
        }).start();

        new Thread(() -> {
            ins = EnumSingleton.instance;
            ins.find();
        }).start();


    }
}
