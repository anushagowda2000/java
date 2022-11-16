package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.Feeling;

import com.xworkz.humanapp.humanbeing.anusha.RoyalEnfield;

public class FeelingTester {
	public static void main(String[] args) {
		Feeling feeling = new Feeling();
		feeling.express();

		RoyalEnfield royalField = new RoyalEnfield();
		royalField.express();
	}
}
