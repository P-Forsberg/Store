package org.example.person;

import org.example.store.Item;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer extends Person {
    private ArrayList<Item> shoppingCart = new ArrayList<>();
    private ArrayList<Command> commands = new ArrayList<>();

    public Customer(String name) {
        super(name);
    }

}
