package com.elltor.designpattern.bridge.test2;

public class Main {
    public static void main(String[] args) {
        Department dp;

        dp = new ComputerDept();
        dp.setMathCourse(new AdvanceMath());
        dp.select();
        dp.setMathCourse(new MathAnalysis());
        dp.select();

        System.out.println();

        dp = new MathematicsDept();
        dp.setMathCourse(new MathAnalysis());
        dp.select();
        dp.setMathCourse(new AdvanceMath());
        dp.select();


    }

}
