package com.elltor.designpattern.Flyweight;

import java.util.HashMap;

public class FlyweightFcatory {
    private HashMap<String,ConcreteFlyweight> flyweightMap = new HashMap<>();

    public FlyweightFcatory() {
        flyweightMap.put("A",new ConcreteFlyweight());
        flyweightMap.put("B",new ConcreteFlyweight());
        flyweightMap.put("C",new ConcreteFlyweight());
        flyweightMap.put("D",new ConcreteFlyweight());
        flyweightMap.put("E",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweightMap.get(key);
    }
}
