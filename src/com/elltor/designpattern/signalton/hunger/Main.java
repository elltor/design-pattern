package com.elltor.designpattern.signalton.hunger;


public class Main {
    private static Singleton2 ins;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Thread(() -> {
            ins = Singleton2.getInstance();
        }).start();
        new Thread(() -> {
            ins = Singleton2.getInstance();
        }).start();
        new Thread(() -> {
            ins = Singleton2.getInstance();
        }).start();

        System.out.println("spend total millisecond: "+(System.currentTimeMillis()-start));
    }
}
