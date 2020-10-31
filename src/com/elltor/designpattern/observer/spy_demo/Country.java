package com.elltor.designpattern.observer.spy_demo;

public abstract class Country {
    protected String countryName;
    protected Spy spy;

    public Country(String countryName, Spy spy) {
        this.countryName = countryName;
        this.spy = spy;
    }

    public abstract void update();
}
