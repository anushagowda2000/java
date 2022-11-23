package com.xworkz.beachapp;

import com.xworkz.beachapp.beach.*;

public class MobileDTOTester {
	public static void main(String[] args) {
		MobileDTO mobile = new MobileDTO();
		mobile.setName("redmi");
		mobile.setColour("blue");
		mobile.setPrice(19000.00);
		System.out.println("the mobile name is :" + mobile.getName());
		System.out.println("the mobile colour is :" + mobile.getColour());
		System.out.println("the mobile price is :" + mobile.getPrice());

	}
}
