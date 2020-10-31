package com.elltor.designpattern.visitor.general_demo;

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        // 接收访问
        System.out.println("ConcreteElementB 接受 "+visitor.getClass().getCanonicalName()+"访问");
        visitor.visitConcreteElementB(this);
    }

    public void operateB(){
        // 暂无操作
    }
}