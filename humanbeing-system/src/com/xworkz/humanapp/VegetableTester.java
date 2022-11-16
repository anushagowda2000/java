package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.Vegetable;

import com.xworkz.humanapp.humanbeing.anusha.Onion;

public class VegetableTester {
	public static void main(String[] args) {
		Vegetable onion = new Vegetable();
		onion.toCook();
		
		Onion ref = new Onion();
		ref.toCook();
	}

}
