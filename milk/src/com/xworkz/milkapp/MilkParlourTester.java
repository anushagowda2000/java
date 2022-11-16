package com.xworkz.milkapp;
import com.xworkz.milkapp.milkparlour.MilkParlour;
public class MilkParlourTester {
	public static void main(String[] args) {
		
		
		String types[] = new String[5];
		types[0] = "blue ";
		types[1] = "green";
		types[2] = "orange";
		types[3] = "tetra";
		types[4] = "yellow ";
		
		String sweet[] = new String [4];
		sweet[0] = "peda";
	    sweet[1] = "mixed fruit";
		sweet[2] = "mysore pak";
		sweet[3] = "kaju";
		
		String products[] = new String[4];
		products[0] = "panner";
	    products[1] = "milk powder";
		products[2] = "cheese";
		products[3] = "butter";
		
		
		MilkParlour milk = new MilkParlour("dodla","ramanagara",types,sweet,products);
		milk.market();
	}
}
