package com.elltor.designpattern.interator;

public interface Iterator<T> {
    T first();
    T next();
    boolean hasNext();
    T currentElement();
}
