package com.elltor.designpattern.signalton.hunger;


/**
 * 单例-饿汉 线程安全
 */
public class Singleton2 {
    private static Singleton2 instance;
    private static int count = 0;
    private static Object lock = new Object();

    private Singleton2() {
        System.out.println("Singleton2 instance has init.---" + (++count));
    }

    /**
     * 加锁, 双重if, 保证只初始化一个对象
     */
    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if(instance==null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public void find() {
        //do operate
        System.out.println("you do a find operate.");

    }
}
