package com.elltor.designpattern.bridge.test2;

public class ComputerDept extends Department{
    @Override
    public void select() {
        System.out.println("计算机系的同学开始选课了");
        mathCourse.select();
    }
}
