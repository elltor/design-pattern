package com.elltor.designpattern.factory.test.prod.material;

import com.elltor.designpattern.factory.test.prod.material.IBottle;

public class PlasticBottle implements IBottle {
    @Override
    public void getBottleInfo() {
        System.out.println("this is a Plastic bottle");
    }
}
