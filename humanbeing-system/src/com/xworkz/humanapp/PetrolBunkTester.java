package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.PetrolBunk;
import com.xworkz.humanapp.humanbeing.anusha.Hp;

public class PetrolBunkTester {
	public static void main(String[] args) {
		PetrolBunk petrolBunk = new PetrolBunk();
		petrolBunk.toRefill();

		Hp hp = new Hp();
		hp.toRefill();
	}
}
