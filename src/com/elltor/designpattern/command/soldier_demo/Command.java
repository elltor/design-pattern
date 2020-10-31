package com.elltor.designpattern.command.soldier_demo;

public abstract class Command {
    protected Soldier soldiers;

    public Command(Soldier soldiers) {
        this.soldiers = soldiers;
    }

    public abstract void executeCommand();
}
