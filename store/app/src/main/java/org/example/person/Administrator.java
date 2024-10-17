
package org.example.person;

public class Administrator extends Manager {
    public Administrator(String name) {
        super(name);
    }

    public void checkSales() {
        System.out.println("this is from admin");
    }
}
