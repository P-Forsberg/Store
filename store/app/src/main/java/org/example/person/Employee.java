package org.example.person;

public class Employee extends Person {
    public int id;

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }
}
