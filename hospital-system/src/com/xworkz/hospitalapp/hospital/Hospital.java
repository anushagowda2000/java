package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital {
	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmentRequired;

	public boolean admit(Patient patient) {
		boolean isAdmitted = true;
		if (isTreatmentRequired)
			if (isEmergency == true) {
				this.patient = patient;
				this.patient.displayInfo();
				System.out.println("Patient can be allowed to ICU ");
			} else {
				System.out.println("Add patient to general ward");
			}
		else {
			System.out.println("no treatment required");
		}
		return isAdmitted;

	}
}
