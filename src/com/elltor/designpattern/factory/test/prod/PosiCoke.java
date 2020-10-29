package com.elltor.designpattern.factory.test.prod;

import com.elltor.designpattern.factory.test.prod.material.IBottle;
import com.elltor.designpattern.factory.test.prod.material.ILiquid;
import com.elltor.designpattern.factory.test.prod.material.IPackaging;

public class PosiCoke implements IDrink {
    private IBottle bottom;
    private ILiquid liquid;
    private IPackaging packaging;

    public IBottle getBottom() {
        return bottom;
    }

    public void setBottom(IBottle bottom) {
        this.bottom = bottom;
    }

    public ILiquid getLiquid() {
        return liquid;
    }

    public void setLiquid(ILiquid liquid) {
        this.liquid = liquid;
    }

    public IPackaging getPackaging() {
        return packaging;
    }

    public void setPackaging(IPackaging packaging) {
        this.packaging = packaging;
    }

    @Override
    public void getDrinkInfo() {
        System.out.println("------Posi Coke 百事可乐------");
        bottom.getBottleInfo();
        liquid.getLiquidInfo();
        packaging.getPackagingInfo();
        System.out.println("---------------------------\n");
    }
}
