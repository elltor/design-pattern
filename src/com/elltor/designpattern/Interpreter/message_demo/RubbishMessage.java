package com.elltor.designpattern.Interpreter.message_demo;

public class RubbishMessage extends Expression {
    @Override
    public void operate(String message) {
        if(message.contains("儿子")){
            System.out.println("这是老妈发过来的短信, 不是骗子: "+message);
        }else{
            System.out.println("骗子短信太猖狂了, 系统自动过滤掉!");
        }
    }
}
