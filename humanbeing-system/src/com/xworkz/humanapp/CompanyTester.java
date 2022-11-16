package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.Company;

import com.xworkz.humanapp.humanbeing.anusha.Tcs;

public class CompanyTester {
	public static void main(String[] args) {
		Company company = new Company();
		company.toWork();

		Tcs tcs = new Tcs();
		tcs.toWork();
	}
}
