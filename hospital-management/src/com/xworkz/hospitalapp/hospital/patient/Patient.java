package com.xworkz.hospitalapp.hospital.patient;

import com.xworkz.hospitalapp.constant.Gender;

public class Patient {
	public String patientName;
	public String address;
	public Gender gender;
	public int age;

	public Patient(String patientName, String address, Gender gender, int age) {
		super();
		this.patientName = patientName;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Patient Name is: " + patientName);
		System.out.println("Patient address is: " + address);
		System.out.println("Patient gender is: " + gender);
		System.out.println("Patient age is: " + age);
	}
}
