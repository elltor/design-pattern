package com.elltor.designpattern.command.soldier_demo;

public class TogetherCommand extends Command{


    public TogetherCommand(Soldier soldiers) {
        super(soldiers);
    }

    @Override
    public void executeCommand() {
        soldiers.together();
    }
}
