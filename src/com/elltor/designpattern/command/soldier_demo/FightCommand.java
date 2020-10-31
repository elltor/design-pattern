package com.elltor.designpattern.command.soldier_demo;

public class FightCommand extends Command{


    public FightCommand(Soldier soldiers) {
        super(soldiers);
    }

    @Override
    public void executeCommand() {
        soldiers.together();
    }
}