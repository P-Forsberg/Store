package org.example.command;

public class SwitchCommand extends Command {

    public SwitchCommand() {
        super("Switch");
    }

    @Override
    public void execute(String[] commandArgs) {
        System.out.println("Du vill byta person" + commandArgs[1]);
    }
}
