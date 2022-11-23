package com.xworkz.beachapp;

import com.xworkz.beachapp.beach.TelevisionDTO;

public class TelevisionDTOTester {

	public static void main(String[] args) {
		TelevisionDTO tele = new TelevisionDTO();
		tele.setName("samsung");
		tele.setColour("black");
		tele.setPrice(29999.00);
		System.out.println("the television name is:" + tele.getName());
		System.out.println("the television name is:" + tele.getColour());
		System.out.println("the television name is:" + tele.getPrice());
	}

}
