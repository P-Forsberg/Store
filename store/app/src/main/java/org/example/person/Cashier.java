package org.example.person;

public class Cashier extends Employee {
    public Cashier(String name) {
        super(name);
    }

    public void checkout() {
        System.out.println("this is from cashier");
    }
}
