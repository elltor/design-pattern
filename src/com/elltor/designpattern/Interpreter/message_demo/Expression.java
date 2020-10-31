package com.elltor.designpattern.Interpreter.message_demo;

public abstract class Expression {
    public void interpret(Context context){
        if(context.getMessage().isEmpty()){
            System.out.println("空短信,不做处理");
            return;
        }else{
            operate(context.getMessage());
        }
    }

    public abstract void operate(String message);
}
