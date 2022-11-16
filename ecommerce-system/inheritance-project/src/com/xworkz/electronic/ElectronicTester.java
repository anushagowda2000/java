package com.xworkz.electronic;

import com.xworkz.electronic.electronic.Electronic;
import com.xworkz.electronic.laptop.Laptop;

public class ElectronicTester {

	public static void main(String[] args) {
		Electronic electronic = new Electronic();
		electronic.toPerformTask();
		System.out.println("electronic devices are helpful to perform task" ); 
		
		Laptop laptop = new Laptop();
		laptop.toPerformTask();
		System.out.println("laptop is used to do coding" ); 

	}

}
