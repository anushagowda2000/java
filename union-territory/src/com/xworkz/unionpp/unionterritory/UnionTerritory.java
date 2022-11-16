package com.xworkz.unionpp.unionterritory;

public class UnionTerritory {
int id;

public int states;
	
	public int unionTerrorities(int unionGovernment) {
		this.states = this.states - unionGovernment;
		return unionGovernment;
	}
		
		public int federalTerrorities(int unionGovernment) {
			this.states = this.states + unionGovernment;
			return unionGovernment;
}
		public void administration(int unionGovernment, UnionTerritory  federalTerrorities) {
		System.out.println("union terrority is ruled by president");
		unionTerrorities(unionGovernment);
		federalTerrorities(unionGovernment);
		System.out.println("union terrority is different from states");
}
}
