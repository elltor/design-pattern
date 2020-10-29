package com.elltor.designpattern.factory.simplefactory;

public class BreadFactory {
    public static BreadMaker makeBread(int breadType) {
        switch (breadType) {
            case 0:
                return new BlackBread();
            case 1:
                return new HoneyBread();
            default: {
                // 当用户输入一个不存在的breadType, 工厂不能创建对象, 将返回null对象
                System.out.println("工厂没有这种类型的面包");
                return null;
            }
        }
    }
}
