package com.elltor.designpattern.factory.test;


public class Main {


    public static void main(String[] args) {
        IDrinkFactory beiJingFactory = new BeiJingDrinkFactory();
        IDrinkFactory heNanFactory = new HeNanDrinkFactory();

        System.out.println("顾客购买河南工厂生产的饮料:");
        heNanFactory.createCocaCoke().getDrinkInfo();
        heNanFactory.createPosiCoke().getDrinkInfo();
        heNanFactory.createBlackTea().getDrinkInfo();

        System.out.println("顾客购买北京生产的饮料:");
        beiJingFactory.createCocaCoke().getDrinkInfo();
        beiJingFactory.createPosiCoke().getDrinkInfo();
        beiJingFactory.createBlackTea().getDrinkInfo();

    }

}
