package com.elltor.designpattern.command.general_demo;

/**
 * 命令传达者代码
 */
public class Invoker {
    private Command command;

    /**
     * 执行传达的命令
     */
    public void handle(){
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    /**
     * 传达给传达者命令
     */
    public void setCommand(Command command) {
        this.command = command;
    }
}
