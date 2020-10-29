package com.elltor.designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("笔记本在国内用时的适配器:");
        Adapter adapter = new Adapter220V();
        adapter.powerSupply();

        System.out.println("--------------------");

        System.out.println("笔记本在国外用时的适配器:");
        adapter = new Adapter110V();
        adapter.powerSupply();






    }
}
