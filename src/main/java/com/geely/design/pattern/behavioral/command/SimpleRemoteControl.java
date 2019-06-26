package com.geely.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class SimpleRemoteControl {
    Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressed() {
        command.execute();
    }
}
