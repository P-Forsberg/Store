package org.example;
import java.util.Scanner;
import org.example.menu.Menu;
import org.example.menu.WelcomeMenu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private Scanner commandScanner = new Scanner(System.in);
    private boolean running = true;
    private Menu menu = new WelcomeMenu();

    public static void main(String[] args) {

        Main application = new Main();
        application.menu.present();

        while(application.running){
            String input = application.commandScanner.nextLine();
            application.menu.tryExecuteCommand(input);
        }

        Store ica = new Store(null, null);
        Manager anton = new Manager("Anton", 0);
        Administrator josef = new Administrator("Josef",1);
        Employee pontus = new Employee("Pontus", 2);
        Employee cecila = new Employee("Cecilia", 4);
        Cashier olga = new Cashier("Olga", 3);
        Customer maria = new Customer("Maria");
        System.out.println("hej " + "\n" + anton);
        System.out.println(pontus + "\n");


        for (Employee employee : ica.getEmployees()){
            System.out.println("Name: " + employee.getName() + ", ID: " + employee.getId());
        }

        for (Item item : ica.items){
            System.out.println(item.getName() + " " + item.getDouble());
        }

    }
}