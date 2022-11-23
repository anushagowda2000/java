package com.xworkz.beachapp;

import com.xworkz.beachapp.beach.PaintDTO;

public class PaintDTOTester {
	public static void main(String[] args) {
		PaintDTO paint = new PaintDTO();
		paint.setName("nippon");
		paint.setId(123);
		paint.setColour("pink");
		System.out.println("the paint name is:" + paint.getName());
		System.out.println("the paint id is:" + paint.getId());
		System.out.println("the paint colour is:" + paint.getColour());

	}
}
