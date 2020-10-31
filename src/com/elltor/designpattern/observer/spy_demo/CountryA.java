package com.elltor.designpattern.observer.spy_demo;

public class CountryA extends Country{

    public CountryA(String countryName, Spy spy) {
        super(countryName, spy);
    }

    /**
     * 获取情报的方法
     */
    @Override
    public void update() {
        System.out.println(countryName+"得到情报: "+spy.getIntelligence()+" 决定与甲国开战!");
    }
}
