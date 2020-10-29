package com.elltor.designpattern.factory.test;

import com.elltor.designpattern.factory.test.prod.BlackTea;
import com.elltor.designpattern.factory.test.prod.CocaCoke;
import com.elltor.designpattern.factory.test.prod.PosiCoke;
import com.elltor.designpattern.factory.test.prod.material.*;

public class BeiJingDrinkFactory implements IDrinkFactory {

    @Override
    public BlackTea createBlackTea() {
        BlackTea blackTea = new BlackTea();
        blackTea.setBottom(new PlasticBottle());
        blackTea.setLiquid(new NormalLiquid());
        blackTea.setPackaging(new TFBoysPackaging());
        return blackTea;
    }

    @Override
    public CocaCoke createCocaCoke() {
        CocaCoke cocaCoke = new CocaCoke();
        cocaCoke.setBottom(new PlasticBottle());
        cocaCoke.setLiquid(new NormalLiquid());
        cocaCoke.setPackaging(new TFBoysPackaging());
        return cocaCoke;
    }

    @Override
    public PosiCoke createPosiCoke() {
        PosiCoke posiCoke = new PosiCoke();
        posiCoke.setBottom(new PlasticBottle());
        posiCoke.setLiquid(new NormalLiquid());
        posiCoke.setPackaging(new TFBoysPackaging());
        return posiCoke;
    }
}
