package com.elltor.designpattern.bridge.test2;

public class MathematicsDept extends Department{
    @Override
    public void select() {
        System.out.println("数学系的同学开始选课了");
        mathCourse.select();
    }
}
