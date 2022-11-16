package com.xworkz.overloading;

import com.xworkz.overloading.conceptoverloading.PetrolBunk;

public class PetrolBunkTester {
	public static void main(String[] args) {

		String workersName[] = { "sandesh", "shahhsi", "anu", "usha", "ammu", "prasahnth", "sagar" };
		/*PetrolBunk bunk = new PetrolBunk(123, "new petrol bunk", "rajajinagar", workersName);

		System.out.println(bunk.id + " " + bunk.name + " " + bunk.location + " " + workersName);*/
		PetrolBunk bunk = new PetrolBunk(workersName);
		bunk.displayDetails();
				
	}
}