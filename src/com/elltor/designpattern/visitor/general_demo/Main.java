package com.elltor.designpattern.visitor.general_demo;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        ConcreteVisitor concreteVisitor = new ConcreteVisitor();
        objectStructure.accept(concreteVisitor);

    }
}
