package org.example.person;

import org.example.util.Command;
import java.util.ArrayList;
import java.util.List;
import org.example.store.Item;

public class Customer extends Person {
    private ArrayList<Item> cart;

    public Customer(String name) {
        super(name);
        initializeCommands();
    }

    private void initializeCommands() {
        commands.add(new Command() {
            @Override
            public void execute() {
                addToCart();
            }

            @Override
            public String getDescription() {
                return "Add to cart";
            }
        });

        commands.add(new Command() {
            @Override
            public void execute() {
                checkout();
            }

            @Override
            public String getDescription() {
                return "Checkout";
            }
        });
    }

    @Override
    public ArrayList<Command> getCommands() {
        return commands;
    }

    public void addToCart() {
        System.out.println("Item added to cart.");
    }

    public void checkout() {
        System.out.println("Checking out...");
    }
}
