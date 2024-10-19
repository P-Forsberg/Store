/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import org.example.store.*;
import org.example.person.Administrator;
import org.example.person.Cashier;
import org.example.person.Customer;
import org.example.person.Employee;
import org.example.person.Manager;
import org.example.person.Person;
import org.example.util.Menu;

public class App {

    public static void main(String[] args) {
        ArrayList<Person> people = initializePeople();
        Menu menu = new Menu(people);
        Store store = new Store(people);
        store.listEmplyees();
        menu.showMenu();
    }

    private static ArrayList<Person> initializePeople() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Customer("Alice"));
        people.add(new Customer("Bob"));
        people.add(new Cashier("Charlie"));
        people.add(new Manager("David"));
        people.add(new Administrator("Eve"));
        people.add(new Employee("Tyson"));
        return people;
    }
}
