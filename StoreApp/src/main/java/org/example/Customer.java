package org.example;

import java.util.ArrayList;

public class Customer extends Person {
    private ArrayList<Item> shoppingCart;
    public Customer(String name) {
        super(name);
        shoppingCart = new ArrayList<>();
    }
    public void addToChart(Item item){
        shoppingCart.add(item);
        System.out.println(item + " has been added");
    }
   public void checkout() {
    if(shoppingCart.isEmpty()){
        System.out.println("shopping cart is empty ");
    }else {
        System.out.println("checking out with items " + shoppingCart);
        shoppingCart.clear();
    }
   }
   public void showCart(){
    for(Item item : shoppingCart) {
        System.out.println(item.getName() + " - " + item.getDouble());
    }
   }

}
