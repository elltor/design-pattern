package com.elltor.designpattern.command.soldier_demo;

public class Herald {
    private Command command;

    public void notification(){
        command.executeCommand();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
