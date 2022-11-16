package com.xworkz.engg.engineering;

public class Engineering {
int id;
String name;
String loaction;
public double fees;

public double toJoin(double payment) {
	this.fees = this.fees - payment;
	return payment;
}
	
	public double toStudy(double payment) {
		this.fees = this.fees - payment;
		return payment;
	}
		
		public void toGraduate(double fees, Engineering cousin) {
			System.out.println("i am joining engineering");
			toJoin(fees);
			cousin.toStudy(fees);
			System.out.println("i am graduated");
}
}
