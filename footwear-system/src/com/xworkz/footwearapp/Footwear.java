package com.xworkz.footwearapp;

public class Footwear {
	public String footWearId;
	public String brandName;
	public String colour;
	public int size;
	public String model;
	
   public Footwear() {
	   
   }

   public Footwear(String id, String nm, String co, int si,String mod) {
	   System.out.println("Footwear Constructor is called");
	   footWearId = id;
	   brandName = nm;
	   colour = co;
	   size = si;
	   model = mod;
   }

   public void toWear() {
	   System.out.println("footwear looks good");
   }

}
