package org.example.person;

import java.util.ArrayList;

import org.example.util.Command;

public class Employee extends Person {
    private static int idCounter = 1;
    public int id;

    public Employee(String name) {
        super(name);
        id = idCounter++;
    }

    public void thisIsCommand() {
        System.out.println("this is a command");
    }

    @Override
    public ArrayList<Command> getCommands() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCommands'");
    }

    public int getId() {
        return id;
    }

}
