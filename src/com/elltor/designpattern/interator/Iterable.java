package com.elltor.designpattern.interator;

/**
 * 聚集对象
 */
public interface Iterable<T> {
    Iterator<T> createIterator();
}
