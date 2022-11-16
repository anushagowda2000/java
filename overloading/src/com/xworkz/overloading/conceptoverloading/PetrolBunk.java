package com.xworkz.overloading.conceptoverloading;

public class PetrolBunk {

	// instance variables,states/fields/properties
	public int id;
	public String name;
	public String location;
	public String workersName[] = new String[7];

	// recursive constructor is not possible in java
	public PetrolBunk() {
		System.out.println("default constructor is called");

	}

	public PetrolBunk(String workersName[]) {
		this(123, "new petrol bunk", "rajajinagar", workersName);
		System.out.println("one parameterised constructor is called");

	}

	public PetrolBunk(int id, String name, String location, String[] workersName) {
		// below statement is used for constructor chaining;

		this();
		System.out.println("calling 4 parametrised consstructor");
		this.id = id;
		this.name = name;
		this.location = location;
		this.workersName = workersName;
	}

	public void provideFuels() {
		System.out.println("dud kottu petrol haksi");
	}
	
	public void displayDetails(){
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id + " " + this.name + " " +this.location);
		System.out.println("list of workers for" +this.name);
		for(int i = 0; i<workersName.length; i++) {
		System.out.println(workersName[i]);
	}
}
}