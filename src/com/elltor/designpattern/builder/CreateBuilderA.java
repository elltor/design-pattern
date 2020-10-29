package com.elltor.designpattern.builder;

public class CreateBuilderA extends Builder {
    private Product prod = new Product();



    @Override
    public void BuildPartA() {
        prod.add("part A");
    }

    @Override
    public void BuildPartB() {
        prod.add("part B");
    }

    @Override
    public Product getResult() {
        return prod;
    }
}
