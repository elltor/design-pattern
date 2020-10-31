package com.elltor.designpattern.mediator;

public interface Mediator {
    void send(String message, Colleague colleague);
}
