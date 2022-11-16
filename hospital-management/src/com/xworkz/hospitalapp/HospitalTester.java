package com.xworkz.hospitalapp;

import java.util.Scanner;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.patient.*;

public class HospitalTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the patient name");
		String patientName = sc.next();
		System.out.println("Enter the patient's address");
		String address = sc.next();
		System.out.println("Enter the patient's age");
		int age = sc.nextInt();
		Patient patient = new Patient(patientName, address, Gender.male, age);
		Hospital hospital = new Hospital();
		hospital.isEmergency = true;
		hospital.isTreatmentRequired = true;
		hospital.admit(patient);
		sc.close();

	}
}
