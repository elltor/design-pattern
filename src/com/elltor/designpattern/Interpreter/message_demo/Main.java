package com.elltor.designpattern.Interpreter.message_demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Expression expression;
        Context context1 = new Context();
        Context context2 = new Context();
        Context context3 = new Context();

        context1.setMessage("xxx, 你好, 你已经通过了我们的面试, 可以到我们这里参加工作了");
        context2.setMessage("儿子, 老爸怕你钱不够花, 给你转了一笔钱.");
        context3.setMessage("嘿,还记得我吗? 我是你高中同学, 最近手头紧, 给我汇款到:564654");

        List<Context> messages = new ArrayList<>();

        messages.add(context1);
        messages.add(context2);
        messages.add(context3);

        for(Context c : messages){
            if(c.getMessage().contains("汇款")){
                System.out.println("系统疑似收到垃圾短信:"+c.getMessage());
                expression = new RubbishMessage();
                expression.interpret(c);
            }else{
                System.out.println("收到正常短信:"+c.getMessage());
                expression = new NormalMessage();
                expression.interpret(c);
            }
            System.out.println("--------------------");

        }


    }
}
