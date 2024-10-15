package org.example;

public class Manager extends Employee
{
    public Manager(String name, int id) {
        super(name, id);
    }


    @Override
    public String toString() {
        return "name: " + getName() + "ID: "+ getId();
    }
}
