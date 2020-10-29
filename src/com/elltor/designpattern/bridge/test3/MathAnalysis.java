package com.elltor.designpattern.bridge.test3;

public class MathAnalysis implements Course {
    @Override
    public void select() {
        System.out.println("选择了数学分析这门课程.");
    }
}
