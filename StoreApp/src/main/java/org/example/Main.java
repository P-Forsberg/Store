package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        ArrayList<Employee> emp = new ArrayList<>();
        ArrayList<CashRegister> reg = new ArrayList<>();
        reg.add(cashRegister);
        Manager anton = new Manager("Anton", 0);
        Administrator josef = new Administrator("Josef", 1);
        Employee pontus = new Employee("Pontus", 2);
        Employee cecila = new Employee("Cecilia", 4);
        Employee olga = new Employee("Olga", 3);
        Customer maria = new Customer("Maria");
        emp.add(anton);
        emp.add(josef);
        emp.add(pontus);
        emp.add(olga);
        emp.add(anton);
        Store ica = new Store(reg, emp, "ica");
        Menu menu = new Menu(ica);
        menu.showmenu();

    }
}
