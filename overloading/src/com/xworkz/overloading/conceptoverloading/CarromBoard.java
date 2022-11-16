package com.xworkz.overloading.conceptoverloading;

public class CarromBoard {
 public String brand;
 public String material;
 public String colour;
 public String manuFacturerNames[] = new String[5];
 
 
 
 
 public CarromBoard() {
	System.out.println("default constructor is invoked");
}
 
 public CarromBoard(String manufacturerNames[]) {
	 this("GSI","wood","brown",manufacturerNames);
	System.out.println("one parametrised constructor is invoked");
}
 

	public CarromBoard(String brand, String material, String colour, String[] manuFacturerNames) {
	this.brand = brand;
	this.material = material;
	this.colour = colour;
	this.manuFacturerNames = manuFacturerNames;
}


	
	 
 public void toPlay() {
	 System.out.println("banni carrom adana");
 }
 
 public void displayDetails() {
	 System.out.println("displayDetails() is invoked");
	 System.out.println(this.brand + " " + this.material + " " + this.colour);
	 System.out.println("lists of manufacturers for" + this.brand);
	for(int i = 0; i<manuFacturerNames.length; i++) {
		System.out.println(manuFacturerNames[i]);
	} 
 }
 }