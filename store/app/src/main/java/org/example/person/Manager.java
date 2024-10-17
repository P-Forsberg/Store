
package org.example.person;

public class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }

    public void assignCashier() {
        System.out.println("this is from manager");
    }
}
