package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private ArrayList<Item> shoppingCart;

    public Customer(String name) {
        super(name);
        shoppingCart = new ArrayList<>();
    }

    public void addToCart(Item item) {
        shoppingCart.add(item);
        System.out.println(name + " added " + item.getName() + " to the cart");

    }

    public ArrayList<Item> getShoppingCart() {
        return shoppingCart;
    }

    public void enterStore(Store store) {
        System.out.println("Welcome to the " + store.getName() + " !");
    }

    public double checkout() {
        double total = 0;
        if (shoppingCart.isEmpty()) {
            System.out.println("shopping cart is empty ");
        }
        for (Item item : shoppingCart) {
            total += item.getPrice();
        }
        System.out.println(name + " has checked out. Total amount: " + total);
        shoppingCart.clear();
        return total;
    }

    public List<Command> getAvailableCommands(Store store) {
        final List<Command> commands = new ArrayList<>();
        commands.add(new Command() {

            @Override
            public void execute() {
                enterStore(store);
            }

            @Override
            public String getDescription() {
                return "Enter the Store";
            }
        });
        for (Item item : store.getInventory()) {
            commands.add(new Command() {
                @Override
                public void execute() {
                    addToCart(item);
                }

                @Override
                public String getDescription() {
                    return "add " + item.getName() + " to cart";
                }
            });
        }
        commands.add(new Command() {
            @Override
            public void execute() {
                checkout();
            }

            @Override
            public String getDescription() {
                return "checkout";
            }
        });
        return commands;
    }
}
