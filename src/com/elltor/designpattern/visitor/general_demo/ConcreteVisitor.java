package com.elltor.designpattern.visitor.general_demo;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        System.out.println(elementA.getClass().getCanonicalName()+" 被 "+this.getClass().getCanonicalName()+"访问!");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        System.out.println(elementB.getClass().getCanonicalName()+" 被 "+this.getClass().getCanonicalName()+"访问!");

    }
}
