package com.elltor.designpattern.Interpreter.message_demo;

public class NormalMessage extends Expression {
    @Override
    public void operate(String message) {
        if(message.contains("面试")){
            System.out.println("恭喜, 收到了面试通知 ==> "+message);
        }else{
            System.out.println("普通短信==> "+message);
        }
    }
}
