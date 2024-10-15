package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<CashRegister> cashRegisters;
    public List<Employee> employees;
    public List<Item> items;

    public Store(List cashRegisters, List employees){
        this.cashRegisters = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.items = new ArrayList<>();
        createItems();
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void createItems(){
        Item milk = new Item("milk", 20.0);
        Item bread = new Item("bread", 20.0);
        Item orange = new Item("orange", 20.0);
        Item apple = new Item("apple", 20.0);

        addItem(bread);
        addItem(apple); 
        addItem(milk);
        addItem(orange);
    }
}
