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
        createEmployees();
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

    public void addEmployees(Employee employee) {
        employees.add(employee);
    }
    public void createEmployees() {
        Employee anton = new Employee("Anton", 0);
        Employee pontus = new Employee("Pontus", 1);
        Employee josef = new Employee("Josef", 2);
        Employee olga = new Employee("Olga", 3);
        Employee cecilia = new Employee("Cecilia", 4);

        addEmployees(anton);
        addEmployees(pontus);
        addEmployees(josef);
        addEmployees(olga);
        addEmployees(cecilia);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
