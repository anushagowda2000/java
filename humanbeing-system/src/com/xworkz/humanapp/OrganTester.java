package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.Organ;
import com.xworkz.humanapp.humanbeing.anusha.Eyes;

public class OrganTester {
	public static void main(String[] args) {
		Organ organ = new Organ();
		organ.toSense();

		Eyes eyes = new Eyes();
		eyes.toSense();
	}
}
