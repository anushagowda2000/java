package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.Continent;

import com.xworkz.humanapp.humanbeing.anusha.Asia;

public class ContinentTester {
	public static void main(String[] args) {
		Continent continent = new Continent();
		continent.collectiveRegion();

		Asia ref = new Asia();
		ref.collectiveRegion();
	}
}
