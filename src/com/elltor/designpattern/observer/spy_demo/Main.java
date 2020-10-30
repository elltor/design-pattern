package com.elltor.designpattern.observer.spy_demo;

public class Main {

    public static void main(String[] args) {
        Spy007 spy = new Spy007();

        //两个国家雇佣了007, 这两个国家是观察者
        CountryA countryA = new CountryA("乙国", spy);
        CountryB countryB = new CountryB("丙国", spy);

        //间谍spy记下两个国家(记录通知对象)
        spy.attach(countryA);
        spy.attach(countryB);

        //发现情报(间谍状态改变)
        spy.setIntelligence("发现甲国研制了核武器!");

        //向两个国家汇报(通知观察者)
        spy.notifyCountry();

    }
}
