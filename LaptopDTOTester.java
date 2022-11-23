package com.xworkz.beachapp;

import com.xworkz.beachapp.beach.*;

public class LaptopDTOTester {

	public static void main(String[] args) {
		LaptopDTO laptop = new LaptopDTO();
		laptop.getName();
		laptop.getPrice();
		laptop.getColour();
		System.out.println("the name is :" + laptop.getName());
		System.out.println("the name is :" + laptop.getPrice());
		System.out.println("the name is :" + laptop.getColour());
	}

}
