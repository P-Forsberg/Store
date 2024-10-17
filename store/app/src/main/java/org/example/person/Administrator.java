
package org.example.person;

public class Administrator extends Manager {
    public Administrator(String name, int id) {
        super(name, id);
    }

    public void checkSales() {
        System.out.println("this is from admin");
    }
}
