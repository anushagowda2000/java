package com.xworkz.watchapp;

public class Watch {
	public String watchId;
	public String brandName;
	public String colour;
	public int price;
	public String type;
	
   public Watch() {
	   
   }

   public Watch(String id, String nm, String co, int pr,String typ) {
	   System.out.println("watch Constructor is called");
	   watchId = id;
	   brandName = nm;
	   colour = co;
	   price = pr;
	   type = typ;
   }

   public void toWear() {
	   System.out.println("watch looks stylish");
   }
}
