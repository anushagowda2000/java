package com.xworkz.beachapp;

import com.xworkz.beachapp.beach.BeachDTO;

public class BeachDTOTester {
	public static void main(String[] args) {
		BeachDTO beach = new BeachDTO();
		beach.setName("malpe");
		beach.setPlace("udupi");
		System.out.println("the beach name is:" + beach.getName());
		System.out.println("the beach name is:" + beach.getPlace());

	}
}
