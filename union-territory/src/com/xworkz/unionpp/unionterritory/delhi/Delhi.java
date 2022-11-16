package com.xworkz.unionpp.unionterritory.delhi;

import com.xworkz.unionpp.unionterritory.UnionTerritory;

public class Delhi extends UnionTerritory {

	public static void main(String[] args) {
		Delhi govt = new Delhi();
		govt.federalTerrorities(8);
		System.out.println("there are 8 union territories" + govt.states);

		Delhi govt1 = new Delhi();
		govt1.federalTerrorities(9);
		System.out.println("there are 9 federal territories" + govt1.states);

		govt.administration(9, govt1);
		System.out.println("there are 8 union territories" + govt.states);
		System.out.println("there are 9 federal territories" + govt1.states);

	}

}
