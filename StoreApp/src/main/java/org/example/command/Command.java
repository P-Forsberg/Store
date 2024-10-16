package org.example.command;

public abstract class Command {

    private final String name;

    public Command(String name) {
        this.name = name;
    }

    public abstract void execute(String [] commandArgs);

    public String getName() {
        return name;
    }
}
