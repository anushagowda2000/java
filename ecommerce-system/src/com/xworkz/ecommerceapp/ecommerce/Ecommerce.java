package com.xworkz.ecommerceapp.ecommerce;

public class Ecommerce {
 int ecommerceId;
 String tax;
 String coupon;
  public double price;
  
  public double toBuy(double cost) {
	  this.price = this.price - cost;
	  return cost;
  }
	  public double toCart(double cost) {
		  this.price = this.price + cost;
		  return cost;
	  }
	  
	  public void toPresentGift(double cost,Ecommerce toGift) {
	  System.out.println("presenting the gift");
	  toBuy(cost);
	  toGift.toCart(cost);
	  System.out.println("presented gift..");
  }
}
