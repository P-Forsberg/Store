package org.example;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends Manager {
    public Administrator(String name, int id) {
        super(name, id);
    }

    public void hireEmployee(String employeeName) {
        System.out.println(name + " hired a new emplyee: " + employeeName);
    }

    public void assignCashier(Cashier cashier, CashRegister register) {
        register.setCashier(cashier);
        System.out.println(cashier.getName() + " has been assigned as cashier");
    }

    public List<Command> getAvailableCommands(Store store) {
        List<Command> commands = new ArrayList<>();

        commands.add(new Command() {

            @Override
            public void execute() {
                hireEmployee(name);
            }

            @Override
            public String getDescription() {
                return "Hire a new employee";
            }
        });

        commands.add(new Command() {
            @Override
            public void execute() {

            }
        });
    }
}
