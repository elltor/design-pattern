package com.elltor.designpattern.adapter;

public class PowerPort220V {
    //适配器提供的电源
    public void powerSupply() {
        System.out.println("220V电源向外输出了220V电压.");
    }
}
