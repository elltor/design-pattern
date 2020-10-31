package com.elltor.designpattern.visitor.general_demo;

public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        // 接收访问
        System.out.println("ConcreteElementA 接受 "+visitor.getClass().getCanonicalName()+"访问");
        visitor.visitConcreteElementA(this);
    }

    public void operateA(){
        // 暂无操作
    }
}
