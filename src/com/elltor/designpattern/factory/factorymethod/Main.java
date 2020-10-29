package com.elltor.designpattern.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        BreadMaker breadMaker;

        // 黑面包工厂
        BlackBreadFactory blackBreadFactory = new BlackBreadFactory();
        breadMaker = blackBreadFactory.creatMaker();
        breadMaker.getBread();

        // 蜂蜜面包工厂
        HoneyBreadFactory honeyBreadFactory = new HoneyBreadFactory();
        breadMaker = honeyBreadFactory.creatMaker();
        breadMaker.getBread();
    }
}
/*
# UML
@startuml
interface IFactory{
  + createMaker()

}

abstract class BreadMaker{
  + void getBread()
}

class HoneyBread {
  + void getBread()
}

class BlackBread {
  + void getBread()
}

class HoneyBreadFactory{
  + void getBread()
}

class BlackBreadFactory{
  + void getBread()
}

HoneyBread --|> BreadMaker
BlackBread --|> BreadMaker

HoneyBreadFactory  ..|> IFactory
BlackBreadFactory ..|> IFactory


class Main{

}
@enduml
 */