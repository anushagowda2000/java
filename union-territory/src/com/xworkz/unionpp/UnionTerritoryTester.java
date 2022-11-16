package com.xworkz.unionpp;

import com.xworkz.unionpp.unionterritory.*;
import com.xworkz.unionpp.unionterritory.delhi.Delhi;

public class UnionTerritoryTester {

	public static void main(String[] args) {
		UnionTerritory govt = new UnionTerritory();
		govt.federalTerrorities(8);
		System.out.println("there are 8 union territories" + govt.states);

		UnionTerritory govt1 = new UnionTerritory();
		govt1.federalTerrorities(9);
		System.out.println("there are 9 federal territories" + govt1.states);

		govt.administration(9, govt1);
		System.out.println("there are 8 union territories" + govt.states);
		System.out.println("there are 9 federal territories" + govt1.states);
		
		
		// Creating sub class object
		Delhi delhi = new Delhi();
		delhi.federalTerrorities(8);
		System.out.println("there are 8 union territories" + govt.states);

		Delhi delhi1 = new Delhi();
		delhi1.federalTerrorities(9);
		System.out.println("there are 9 federal territories" + delhi1.states);

		delhi.administration(9, delhi1);
		System.out.println("there are 8 union territories" + delhi.states);
		System.out.println("there are 9 federal territories" + delhi1.states);

	}
}
