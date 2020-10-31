package com.elltor.designpattern.mediator;

public class Main {
    public static void main(String[] args) {
        /*
          这个例子中, 中介mediator是两个实体类进行通信
         */

        ConcreteMediator concreteMediator = new ConcreteMediator();

        //两个同事设置中介
        ConcreteColleagueA CA = new ConcreteColleagueA(concreteMediator);
        ConcreteColleagueB CB = new ConcreteColleagueB(concreteMediator);

        //中介设置同事
        concreteMediator.setColleagueA(CA);
        concreteMediator.setColleagueB(CB);

        CA.send("Hello, 我是 A");
        CB.send("Hi, 我是B!");
    }
}
