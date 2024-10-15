package org.example;
public class Item {
    public String name; 
    public double price; 

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double getDouble(){
        return price;
    }
    public String getName(){
        return name;
    }
}
