package com.elltor.designpattern.Interpreter.message_demo;

/**
 * 一个信息包, 包含多有信息, 但不包含解释器
 */
public class Context {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
