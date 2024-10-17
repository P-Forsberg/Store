package org.example.person;

import java.util.ArrayList;

import org.example.util.Command;

public class Employee extends Person {
    public int id;

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }

    public void thisIsCommand() {
        System.out.println("this is a command");
    }

    @Override
    public ArrayList<Command> getCommands() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCommands'");
    }
}
