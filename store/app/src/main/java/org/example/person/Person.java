package org.example.person;

import java.util.ArrayList;

public class Person {

    public String name;
    private ArrayList<Command> commands;

    public Person(String name) {
        this.name = name;
    }

    public ArrayList<Command> getCommands() {
        return commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
