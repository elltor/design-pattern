package com.elltor.designpattern.template_method;

public class Main {
    public static void main(String[] args) {
        AbstractClass templateMethod;

        templateMethod = new ImplClassA();
        templateMethod.executeTemplateMethod();
        System.out.println("--------------------");
        templateMethod = new ImplClassB();
        templateMethod.executeTemplateMethod();
    }
}
