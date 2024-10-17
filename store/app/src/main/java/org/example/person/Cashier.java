package org.example.person;

public class Cashier extends Employee {
    public Cashier(String name, int id) {
        super(name, id);
    }

    public void checkout() {
        System.out.println("this is from cashier");
    }
}
