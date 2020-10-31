package com.elltor.designpattern.command.general_demo;

public class Main {
    public static void main(String[] args) {
        //被命令所执行的对象
        Receiver receiver = new Receiver();

        //创建命令
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);

        //设置执行者
        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);

        //执行者执行命令
        invoker.handle();
    }
}
