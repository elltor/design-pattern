package com.elltor.designpattern.prototype;

/**
 * 原型模式在多线程模式下会出现问题, 会造成拷贝的不是一个对象
 */
public class Main {
    public static void main(String[] args) {
        Nation nat = new Nation();
        nat.setNat("Chine");
        Info info = new Info("Tom",21,nat);
        System.out.println(info.toString());

        Info info1 = (Info)info.clone();

        Nation nat2 = new Nation();
        nat2.setNat("America");
        info1.setNat(nat2);
        info1.setName("Jack");
        System.out.println(info1.toString());
    }
}
