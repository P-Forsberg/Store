package org.example.menu;

import org.example.command.Command;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {

	private final List<Command> commands;

	public Menu() {
		this.commands = new ArrayList<>();
	}

	protected void addCommand(Command command){
		this.commands.add(command);
	}
	public void tryExecuteCommand(String input){
		String[] commandArgs = input.split(" ");
		if(commandArgs.length == 0){
			throw new IllegalArgumentException("Command args empty");
		}

		String commandName = commandArgs[0].toLowerCase();
		for (Command command : commands){
			if (command.getName().equalsIgnoreCase(commandName)){
				command.execute(commandArgs);
				return;
			}
		}
	}

    public abstract void present();
}
