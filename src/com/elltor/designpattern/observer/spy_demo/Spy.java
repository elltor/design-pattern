package com.elltor.designpattern.observer.spy_demo;

import java.util.ArrayList;
import java.util.List;

public class Spy {
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

    /**
     * 离开国家, 对country不发送变更提醒
     * @param country
     */
    public void leave(Country country) {
        countryList.remove(country);
    }

    /**
     * 变更提醒
     */
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
