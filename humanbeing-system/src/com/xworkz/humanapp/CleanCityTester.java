package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.CleanCity;
import com.xworkz.humanapp.humanbeing.anusha.Mysore;

public class CleanCityTester {
public static void main(String[] args) {
	CleanCity clean = new CleanCity();
	clean.recyclingPrograms();
	
	Mysore mysore = new Mysore();
	mysore.recyclingPrograms();
	System.out.println("mysore is a clean city");
}
}
