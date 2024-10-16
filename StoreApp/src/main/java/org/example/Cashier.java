package org.example;

public class Cashier extends Employee {
    private CashRegister register;

    public Cashier(String name, int id, CashRegister register) {
        super(name, id);
        this.register = register;
    }

    public void proccesTransaction(Customer customer) {
        double total = customer.checkout();
        if (total == 0) {
            System.out.println("Sorry cart is empty");
            return;
        }
        printReceipt(customer, total);
    }

    private void printReceipt(Customer customer, double total) {
        System.out.println("Receipt for " + customer.getName() + ":");
        System.out.println("Total Amount: $" + total);
        System.out.println("Thank you for shopping with us!");
    }

    public CashRegister getRegister() {
        return register;
    }
}
