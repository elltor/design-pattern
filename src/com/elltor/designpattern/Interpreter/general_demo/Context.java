package com.elltor.designpattern.Interpreter.general_demo;

/**
 * 一个信息包, 包含多有信息, 但不包含解释器
 */
public class Context {
    private String inputString;
    private String outputString;

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }
}
