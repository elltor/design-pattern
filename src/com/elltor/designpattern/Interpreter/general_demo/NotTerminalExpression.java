package com.elltor.designpattern.Interpreter.general_demo;

public class NotTerminalExpression implements Expression {

    @Override
    public void interpret(Context context) {
        System.out.println(context.getInputString());
        System.out.println("FROM 非终端解释器");
    }
}
