package com.elltor.designpattern.bridge.test2;

/**
 * 分析数学实现类
 * 具有有被选课功能
 */
public class MathAnalysis extends Math {
    @Override
    public void select() {
        System.out.println("选择了数学分析课程!");
    }
}
