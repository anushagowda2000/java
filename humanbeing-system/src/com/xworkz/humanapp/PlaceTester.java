package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.Place;
import com.xworkz.humanapp.humanbeing.anusha.*;


public class PlaceTester {
	public static void main(String[] args) {
		Place place = new Place();
		place.toVisit();
		
		ChamrajNagar city = new ChamrajNagar();
		city.toVisit();
	}
}
