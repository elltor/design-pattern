package com.elltor.designpattern.interator;

public class ConcreteIterator implements Iterator<Object> {

    private ConcreteIterableObject iterableObject;
    private int current = 0;

    public ConcreteIterator(ConcreteIterableObject iterableObject) {
        this.iterableObject = iterableObject;
    }

    @Override
    public Object first() {
        return iterableObject.getElement(0);
    }

    @Override
    public Object next() {
        if (current + 1 <= iterableObject.getSize()) {
            current++;
            if(current<iterableObject.getSize())iterableObject.getElement(current);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if(current < iterableObject.getSize()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object currentElement() {
        return iterableObject.getElement(current);
    }
}
