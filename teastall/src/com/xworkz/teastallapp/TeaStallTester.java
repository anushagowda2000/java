package com.xworkz.teastallapp;
import com.xworkz.teastallapp.tea.TeaStall;

public class TeaStallTester {
	public static void main(String[] args) {

		TeaStall ref = new TeaStall();
		ref.teaStallId = 123;
		ref.name = "chaiwala";
		ref.ownerName = "ganapa";
		System.out.println(ref.teaStallId + " " + ref.name + " " + ref.ownerName);

		TeaStall ref1 = new TeaStall(123, "chai", "anu");
		System.out.println(ref1.teaStallId + " " + ref1.name + " " + ref1.ownerName);

	}
}
