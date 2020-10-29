package com.elltor.designpattern.bridge.test3;

public class Main {
    public static void main(String[] args) {
        Department dp;

        dp = new ComputerDept();
        dp.setCourse(new AdvanceMath());
        dp.select();
        dp.setCourse(new MathAnalysis());
        dp.select();

        System.out.println();

        dp = new MathematicsDept();
        dp.setCourse(new MathAnalysis());
        dp.select();
        dp.setCourse(new AdvanceMath());
        dp.select();
    }
}
