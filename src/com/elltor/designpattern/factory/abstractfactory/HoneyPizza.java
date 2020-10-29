package com.elltor.designpattern.factory.abstractfactory;

public class HoneyPizza extends PizzaMaker {
    
    @Override
    public void getPizza() {
        System.out.println("蜂蜜披萨做好了");
    }
}