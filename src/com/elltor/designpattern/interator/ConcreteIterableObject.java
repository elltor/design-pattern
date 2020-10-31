package com.elltor.designpattern.interator;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个可遍历的对象
 */
public class ConcreteIterableObject implements Iterable<Object>{
    private List list = new ArrayList();


    @Override
    public Iterator<Object> createIterator() {
        return new ConcreteIterator(this);
    }

    public int getSize(){
        return list.size();
    }

    public Object getElement(int i){
        return list.get(i);
    }


    public void setElement(int i,Object obj){
        list.add(i,obj);
    }
}
