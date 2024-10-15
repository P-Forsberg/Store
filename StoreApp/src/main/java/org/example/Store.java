package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<CashRegister> cashRegisters;
    public List<Employee> employees;

    public Store(List cashRegisters, List employees){
        this.cashRegisters = new ArrayList<>();
        this.employees = new ArrayList<>();
    }
}
