package com.elltor.designpattern.factory.test;

import com.elltor.designpattern.factory.test.prod.BlackTea;
import com.elltor.designpattern.factory.test.prod.CocaCoke;
import com.elltor.designpattern.factory.test.prod.PosiCoke;

public interface IDrinkFactory {
    BlackTea createBlackTea();
    CocaCoke createCocaCoke();
    PosiCoke createPosiCoke();
}
