package com.xworkz.ironboxapp;

public class IronBoxTester {
	public static void main(String[] args) {
		   
		   IronBox iron = new IronBox("I24412", "bajaj","pink",1099, "basic dry");
		   System.out.println(iron.ironBoxId + " " + iron.brandName + " " + iron.colour + " " + iron.price + " " + iron.type);
		   
		   IronBox iron1 = new IronBox("I4656342", "usha","black",999, "steam");
		   System.out.println(iron1.ironBoxId + " " + iron1.brandName + " " + iron1.colour + " " + iron1.price + " " + iron1.type);
		   
		   IronBox iron2 = new IronBox("I45152", "havells","green",899, "portable");
		   System.out.println(iron2.ironBoxId + " " + iron2.brandName + " " + iron2.colour + " " + iron2.price + " " + iron2.type);   
		   
		   IronBox iron3 = new IronBox("I45152", "havells","green",899, "portable");
		   System.out.println(iron3.ironBoxId + " " + iron3.brandName + " " + iron3.colour + " " + iron3.price + " " + iron3.type);  
}
}
