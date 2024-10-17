package org.example.person;

import java.util.ArrayList;
import org.example.util.Command;

public abstract class Person {

    private String name;
    public ArrayList<Command> commands;

    public Person(String name) {
        this.name = name;
        commands = new ArrayList<>();
    }

    public abstract ArrayList<Command> getCommands();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
