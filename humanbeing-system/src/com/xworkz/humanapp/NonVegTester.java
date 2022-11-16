package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.NonVeg;
import com.xworkz.humanapp.humanbeing.anusha.Chicken;

public class NonVegTester {
	public static void main(String[] args) {
		NonVeg nonVeg = new NonVeg();
		nonVeg.toEat();

		Chicken chick = new Chicken();
		chick.toEat();
	}
}
