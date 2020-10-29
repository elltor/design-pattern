package com.elltor.designpattern.decorate;

public class ConcreteComponent implements Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent operate....(origin)");
    }
}
