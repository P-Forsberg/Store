
package org.example.person;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public void assignCashier() {
        System.out.println("this is from manager");
    }
}
