package com.icecreamapp;

public class IceCream {

	public String iceCreamId;
	public String name;
	public String flavour;
	public int price;
	public String quantity;
	
   public IceCream() {
	   
   }

   public IceCream(String id, String nm, String fa, int pr,String qty) {
	   System.out.println("IceCream Constructor is called");
	   iceCreamId = id;
	   name = nm;
	   flavour = fa;
	   price = pr;
	   quantity = qty;
   }

   public void toEnjoyEating() {
	   System.out.println("icecream beka");
   }

}