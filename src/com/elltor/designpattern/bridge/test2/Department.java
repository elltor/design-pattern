package com.elltor.designpattern.bridge.test2;

/**
 * 具体的院系课程抽象类
 * 将 select() 功能抽象为结构更好
 */
public abstract class Department {
    protected Math mathCourse;

    public void setMathCourse(Math mathCourse) {
        this.mathCourse = mathCourse;
    }

    public abstract void select();


}
