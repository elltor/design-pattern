package com.elltor.designpattern.memento.general_demo;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("开始");
        originator.show();
        System.out.println("--------------------");

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("停止");
        originator.show();
        System.out.println("--------------------");

        originator.setMemento(caretaker.getMemento());
        originator.show();


    }
}
