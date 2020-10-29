package com.elltor.designpattern.bridge.test3;

public class AdvanceMath implements Course {
    @Override
    public void select() {
        System.out.println("选择了高等数学这么课程.");
    }
}
