package com.xworkz.festivalapp.festival;

public class Festival {
	String name;
	String season;
	public double expenditure;

	public double toPurchase(double spent) {
		this.expenditure = this.expenditure - spent;
		return spent;
	}

	public double toInvite(double spent) {
		this.expenditure = this.expenditure - spent;
		return spent;

	}

	public void toCelebrate(double spent, Festival friend) {
		System.out.println("my family inviting to festival");
		toPurchase(spent);
		friend.toInvite(spent);
		System.out.println("invited fo festival");
	}
}
