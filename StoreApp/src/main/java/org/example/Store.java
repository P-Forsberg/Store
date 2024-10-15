package org.example;

import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    public List<CashRegister> cashRegisters;
    public List<Employee> employees;
    public ArrayList<Item> items;
    private String name;

    public Store(List cashRegisters, List employees, String name) {
        this.name = name;
        this.cashRegisters = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.items = new ArrayList<>();
        createItems();

    }

    public String getName() {
        return name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getInventory() {
        return items;
    }

    public Item getItemByName(String name) {
        return items.stream()
                .filter(item -> item.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public void createItems() {
        List<Item> initialItems = Arrays.asList(
                new Item("Milk", 20.0),
                new Item("Bread", 15.0),
                new Item("Orange", 10.0),
                new Item("Apple", 12.0),
                new Item("Cheese", 30.0),
                new Item("Chicken", 50.0),
                new Item("Rice", 25.0),
                new Item("Pasta", 18.0),
                new Item("Tomato Sauce", 22.0),
                new Item("Butter", 35.0));

        // Lägg till varorna i butiken
        for (Item item : initialItems) {
            addItem(item);
        }
    }

    public void addCashRegister(CashRegister cashRegister) {
        cashRegister.add(cashRegister);
    }

    public void welcome(Person person) {
        if (person instanceof Customer) {
            System.out.println("welcome customer!");
        } else {
            System.out.println("time to get to worrk!!!");
        }
    }
}
