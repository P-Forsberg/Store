package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Store ica = new Store(null, null);
        Manager anton = new Manager("Anton", 0);
        Administrator josef = new Administrator("Josef",1);
        Employee pontus = new Employee("Pontus", 2);
        Employee cecila = new Employee("Cecilia", 4);
        Cashier olga = new Cashier("Olga", 3);
        Customer maria = new Customer("Maria");
        System.out.println("hej " + "\n" + anton);
        System.out.println(pontus);


        for (Item item : ica.items){
            System.out.println(item.getName());
        }

    }
}
