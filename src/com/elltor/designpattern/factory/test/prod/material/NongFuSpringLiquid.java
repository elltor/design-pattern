package com.elltor.designpattern.factory.test.prod.material;

import com.elltor.designpattern.factory.test.prod.material.ILiquid;

public class NongFuSpringLiquid implements ILiquid {
    @Override
    public void getLiquidInfo() {
        System.out.println("the water is nong fu sping.");
    }
}
