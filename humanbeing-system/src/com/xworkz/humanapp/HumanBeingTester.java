package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.HumanBeing;
import com.xworkz.humanapp.humanbeing.anusha.Anusha;

public class HumanBeingTester {
public static void main(String[] args) {
	HumanBeing human = new HumanBeing();
	human.haveSenseOrgans();
	System.out.println("every sense organs have different features");
	
	Anusha anu = new Anusha();
	anu.haveSenseOrgans();
	System.out.println("anusha is a human being");
}
}
