package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.fruit.Fruit;
import com.xworkz.inheritanceapp.mango.Mango;

public class FruitTester {
	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		fruit.toGetEnergy();
		System.out.println("fruit is good for health");

		Mango mango = new Mango();
		mango.toGetEnergy();
		System.out.println("mango is very tasty");

	}
}
