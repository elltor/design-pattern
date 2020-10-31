package com.elltor.designpattern.command.soldier_demo;

public class CableBoatCommand extends Command{

    public CableBoatCommand(Soldier soldiers) {
        super(soldiers);
    }

    @Override
    public void executeCommand() {
        soldiers.together();
    }
}