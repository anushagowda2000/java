package com.xworkz.overloading.conceptoverloading;

public class Market {
	public String name;
	public String address;
	public int branches;
	public String workersName[] = new String[5];

	public Market() {
		System.out.println("default constructor is called");

	}

	public Market(String workersName[]) {
		this("supermarket", "mandya", 5, workersName);
		System.out.println("one parameterised constructor is called");

	}

	public Market(String name, String address, int branches, String[] workersName) {

		this();
		System.out.println("calling 4 parametrised consstructor");
		this.name = name;
		this.address = address;
		this.branches = branches;
		this.workersName = workersName;
	}

	public void toBuyThings() {
		System.out.println("shopping is done");
	}

	public void displayDetails() {
		System.out.println("displayDetails() is invoked");
		System.out.println(this.name + " " + this.address + " " + this.branches);
		System.out.println("list of workers for" + this.name);
		for (int i = 0; i < workersName.length; i++) {
			System.out.println(workersName[i]);
		}
	}
}
