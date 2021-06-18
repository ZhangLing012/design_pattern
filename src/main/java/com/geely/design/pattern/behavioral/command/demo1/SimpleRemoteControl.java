package com.geely.design.pattern.behavioral.command.demo1;

public class SimpleRemoteControl {
    Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressed() {
        command.execute();
    }
}
