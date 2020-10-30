package com.elltor.designpattern.observer.spy_demo;

public abstract class Country {
    protected String countryName;
    protected Spy007 spy;

    public Country(String countryName, Spy007 spy) {
        this.countryName = countryName;
        this.spy = spy;
    }

    public abstract void update();
}
