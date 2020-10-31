package com.elltor.designpattern.Interpreter.general_demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setInputString("输入的文字(被解释的内容)");

        List<Expression> list = new ArrayList<>();

        list.add(new TerminalExpression());
        list.add(new NotTerminalExpression());
        list.add(new TerminalExpression());

        for(Expression a : list){
            a.interpret(context);
            System.out.println("--------------------");
        }
    }
}
