package com.elltor.designpattern.compose;

public abstract class Component {
    protected String componentName;


    public Component(String componentName) {
        this.componentName = componentName;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void show(int depth);
}
