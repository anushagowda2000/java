package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Patient {
	private String name;
	private String address;
	private Gender gender;
	private int age;

	public void displayInfo() {

		System.out.println("name is :" + name + " address is " + address + " gender of patient is " + gender);
		System.out.println("age is " + age);
	}

}
