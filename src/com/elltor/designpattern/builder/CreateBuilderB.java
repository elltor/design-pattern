package com.elltor.designpattern.builder;

public class CreateBuilderB extends Builder {
    private Product prod = new Product();



    @Override
    public void BuildPartA() {
        prod.add("part C");
    }

    @Override
    public void BuildPartB() {
        prod.add("part D");
    }

    @Override
    public Product getResult() {
        return prod;
    }
}
