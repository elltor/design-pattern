package com.elltor.designpattern.observer.spy_demo;

import java.util.ArrayList;
import java.util.List;

public class Spy007 {
    private List<Country> countryList = new ArrayList<>();
    private String intelligence;

    /**
     * 潜入国家
     *
     * @param country
     */
    public void attach(Country country) {
        countryList.add(country);
    }


    public void leave(Country country) {
        countryList.remove(country);
    }

    public void notifyCountry() {
        for (Country c : countryList){
            c.update();
        }
    }

    /**
     * 设置情报
     * @param intelligence
     */
    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * 获取情报
     * @return
     */
    public String getIntelligence() {
        return intelligence;
    }
}
