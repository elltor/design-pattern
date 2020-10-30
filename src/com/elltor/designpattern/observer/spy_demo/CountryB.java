package com.elltor.designpattern.observer.spy_demo;

public class CountryB extends Country{

    public CountryB(String countryName, Spy007 spy) {
        super(countryName, spy);
    }

    /**
     * 获取情报的方法
     */
    @Override
    public void update() {
        System.out.println(countryName+"得到情报: "+spy.getIntelligence()+" 决定与甲国建立关系!");
    }
}
