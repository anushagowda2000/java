package com.xworkz.chocolateapp;

import com.xworkz.chocolateapp.chocolate.Chocolate;
import com.xworkz.chocolateapp.dairymilk.DairyMilk;

public class ChocolateTester {
public static void main(String[] args) {
	Chocolate choco = new Chocolate();
	choco.toEat();
	System.out.println("chocolate increases heart health");
	
	DairyMilk milk = new DairyMilk();
	milk.toEat();
	System.out.println("dairy milk have many varieties");
	
}
}
