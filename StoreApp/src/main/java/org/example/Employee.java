package org.example;

public class Employee extends Person {
    public int id;

    public Employee(String name, int id) {
        super(name);
        this.id = id + 1;

    }

    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Id: " + getId();
    }
}
