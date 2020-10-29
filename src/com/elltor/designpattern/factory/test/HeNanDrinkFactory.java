package com.elltor.designpattern.factory.test;

import com.elltor.designpattern.factory.test.prod.BlackTea;
import com.elltor.designpattern.factory.test.prod.CocaCoke;
import com.elltor.designpattern.factory.test.prod.PosiCoke;
import com.elltor.designpattern.factory.test.prod.material.*;

public class HeNanDrinkFactory implements IDrinkFactory {
    @Override
    public BlackTea createBlackTea() {
        BlackTea blackTea = new BlackTea();
        blackTea.setBottom(new AluminumBottom());
        blackTea.setLiquid(new NongFuSpringLiquid());
        blackTea.setPackaging(new AngelababyPackaging());
        return blackTea;
    }

    @Override
    public CocaCoke createCocaCoke() {
        CocaCoke cocaCoke = new CocaCoke();
        cocaCoke.setBottom(new AluminumBottom());
        cocaCoke.setLiquid(new NongFuSpringLiquid());
        cocaCoke.setPackaging(new AngelababyPackaging());
        return cocaCoke;
    }

    @Override
    public PosiCoke createPosiCoke() {
        PosiCoke posiCoke = new PosiCoke();
        posiCoke.setBottom(new AluminumBottom());
        posiCoke.setLiquid(new NongFuSpringLiquid());
        posiCoke.setPackaging(new AngelababyPackaging());
        return posiCoke;
    }
}
