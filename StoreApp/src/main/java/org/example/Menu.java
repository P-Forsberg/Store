package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private Store store;
	private Scanner scanner;
	private Person currentPerson;

	public Menu(Store store) {
		this.store = store;
		this.scanner = new Scanner(System.in);
	}

	public void showmenu() {
		while (true) {
			List<Command> commands = getAvailableCommands();
			printCommands(commands);

			System.out.println("0. Exit");
			int choice = scanner.nextInt();
			scanner.nextLine();

			if (choice == 0) {
				System.out.println("Exiting...");
				return;
			}
			if (choice > 0 && choice <= commands.size()) {
				commands.get(choice - 1).execute();
			} else {
				System.out.println("invald choise. Please try again");
			}

		}
	}

	private List<Command> getAvailableCommands() {
		if (currentPerson instanceof Customer) {
			return ((Customer) currentPerson).getAvailableCommands(store);
		} else if (currentPerson instanceof Administrator) {
			// return ((Administrator) currentPerson)getAvailableCommands(store);
		}
		return null;
	}

	private void printCommands(List<Command> commands) {
		for (int i = 0; i < commands.size(); i++) {
			System.out.println((i + 1) + " " + commands.get(i).getDescription());
		}
	}

	public void setCurrentPerson(Person person) {
		this.currentPerson = person;
	}

}
