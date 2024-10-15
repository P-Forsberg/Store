package org.example;

import java.util.ArrayList;

public class Customer extends Person {
    private ArrayList<Item> shoppingCart;

    public Customer(String name) {
        super(name);
        shoppingCart = new ArrayList<>();
    }

    public void addToChart(String itemName, Store store) {
        Item itemToAdd = store.getItemByName(itemName);
        if (itemToAdd != null) {
            shoppingCart.add(itemToAdd);
            System.out.println(itemToAdd.getName() + " added to cart");
        } else {
            System.out.println(itemName + " is not avaiable");
        }
    }

    public void checkout() {
        if (shoppingCart.isEmpty()) {
            System.out.println("shopping cart is empty ");
        } else {
            System.out.println("checking out with items " + shoppingCart);
            shoppingCart.clear();
        }
    }

    public void showCart() {
        for (Item item : shoppingCart) {
            System.out.println(item.getName() + " - " + item.getDouble());
        }
    }

}
