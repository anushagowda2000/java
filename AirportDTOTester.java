package com.xworkz.beachapp;

import com.xworkz.beachapp.beach.AirportDTO;

public class AirportDTOTester {
	public static void main(String[] args) {
		AirportDTO airport = new AirportDTO();
		airport.setAirportId("abc5756");
		airport.setName("kempegowda international airport");
		System.out.println("the airport id is:" + airport.getAirportId());
		System.out.println("the airport id is:" + airport.getName());

	}
}
