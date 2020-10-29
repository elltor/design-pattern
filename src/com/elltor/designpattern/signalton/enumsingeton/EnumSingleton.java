package com.elltor.designpattern.signalton.enumsingeton;

public enum EnumSingleton {
    instance();

    EnumSingleton(){
        System.out.println("EnumSingleton has init.");
    }

    public void find() {
        //do operate
        System.out.println("you do a find operate.");

    }
}
