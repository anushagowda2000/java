package com.xworkz.overloading;

import com.xworkz.overloading.conceptoverloading.Market;

public class MarketTester {
	public static void main(String[] args) {

		String workersName[] = { "tom", "jerry", "bheem", "kaliya", "doreamon", };

		Market market = new Market(workersName);
		market.displayDetails();

	}
}
