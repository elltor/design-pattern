package com.elltor.designpattern.signalton.hunger;

/**
 * 单例-饿汉
 * getInstance() 方法在多线程环境下可能会出现线程安全问题
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance has init.");
    }

    /**
     * 线程不安全
     */
    public static Singleton getInstance() {
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }

    public void find() {
        //do operate
        System.out.println("you do a find operate.");

    }
}
