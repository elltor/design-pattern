package com.elltor.designpattern.decorate;

public class Decorator implements Component {
    protected Component component;

    public void setComponent(Component component){
        this.component=component;
    }


    @Override
    public void operate() {
        if(this.component!=null){
            component.operate();
        }
    }
}
