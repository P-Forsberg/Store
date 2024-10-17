package org.example.util;

import java.util.List;
import java.util.Scanner;

import org.example.person.Person;
import org.example.store.Store;

public class Menu {
    private Store store;
    private Scanner scanner;
    private List<Person> people;

    public Menu(List<Person> people) {
        this.scanner = new Scanner(System.in);
        this.people = people;
    }

    public void showMenu() {
        System.out.println("------ Select a person-------");
        while (true) {
            for (int i = 0; i < people.size(); ++i) {
                System.out.println((i + 1) + " : " + people.get(i).getName());
            }
            System.out.println("0. exit");
            int choice = getChoice();
            if (choice == 0) {
                break;
            } else if (choice > 0 && choice <= people.size()) {
                handlePerson(people.get(choice - 1));
            } else {
                System.out.println("invalid choice try again");
                scanner.close();
            }
        }
    }

    private int getChoice() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                return choice;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
    }

    private void handlePerson(Person person) {
        while (true) {
            System.out.println("available commands for this person");
            int index = 1;
            for (Command c : person.getCommands()) {
                System.out.println(index++ + ". " + c.getDescription());
            }
            System.out.println("0. go back");
            int choice = getChoice();
            if (choice == 0) {
                break;
            } else if (choice > 0 && choice <= person.getCommands().size()) {
                person.getCommands().get(choice - 1).execute();
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
