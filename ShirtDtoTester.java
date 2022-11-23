package com.xworkz.beachapp;

import com.xworkz.beachapp.beach.ShirtDto;

public class ShirtDtoTester {
	public static void main(String[] args) {
		ShirtDto shirt = new ShirtDto();
		shirt.setBrandName("metronaut");
		System.out.println("the shirt colour is:" + shirt.getBrandName());

		ShirtDto shirt1 = new ShirtDto();
		shirt1.setColour("black");
		System.out.println("the shirt size is:" + shirt1.getColour());

		ShirtDto shirt2 = new ShirtDto();
		shirt1.setSize("m");
		System.out.println("the shirt size is:" + shirt2.getSize());
	}
}
