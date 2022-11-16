package com.xworkz.coffeeapp.coffeepowder;

public class CoffeePowder {
String brandName;
String flavour;
  public double price;
  
  public double buy(double cost) {
  this.price = this.price - cost;
  return cost;
  }
  
  public double prepare(double cost) {
	  this.price = this.price + cost;
	  return cost;
	  }
  public void toServe(double cost, CoffeePowder sister ) {
  System.out.println("serving coffee");
  buy(cost);
  sister.prepare(cost);
  System.out.println("serving done");
 
}
}
