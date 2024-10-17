package org.example.util;

import java.util.Scanner;

import org.example.store.Store;

public class Menu {
    private Store store;
    private Scanner scanner;
    // private Commandable Person;

    public Menu() {
        this.store = store;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("""
                        --------Select person-------
                            1. Enter as Customer
                            2. Enter as Employee
                    """);
            int choice = getChoice();
            switch (choice) {
                case 1:

            }
        }
    }

    private int getChoice() {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                return choice;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
