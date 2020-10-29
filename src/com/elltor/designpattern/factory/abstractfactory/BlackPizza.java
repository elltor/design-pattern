package com.elltor.designpattern.factory.abstractfactory;

public class BlackPizza extends PizzaMaker {
    @Override
    public void getPizza() {
        System.out.println("黑烤披萨做好了");
    }
}
