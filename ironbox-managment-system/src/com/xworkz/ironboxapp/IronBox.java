package com.xworkz.ironboxapp;

public class IronBox {
	public String ironBoxId;
	public String brandName;
	public String colour;
	public int price;
	public String type;
	
   public IronBox() {
	   
   }

   public IronBox(String id, String nm, String co, int pr,String typ) {
	   System.out.println("IronBox Constructor is called");
	   ironBoxId = id;
	   brandName = nm;
	   colour = co;
	   price = pr;
	   type = typ;
   }

   public void toIronClothes() {
	   System.out.println("To iron clothes of all the types");
}
}