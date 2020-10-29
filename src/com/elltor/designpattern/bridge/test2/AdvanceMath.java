package com.elltor.designpattern.bridge.test2;

/**
 * 高等数学实现类
 * 具有有被选课功能
 */
public class AdvanceMath extends Math{
    @Override
    public void select() {
        System.out.println("选择了高等数学课程.");
    }
}
