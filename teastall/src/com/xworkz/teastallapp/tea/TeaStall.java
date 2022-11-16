package com.xworkz.teastallapp.tea;

public class TeaStall {
	public int teaStallId;
	public String name;
	public String ownerName;

	public TeaStall() {
		System.out.println("TeaStall Constructor is called");
	}

	public TeaStall(int teaStallId, String name, String ownerName) {
		this.teaStallId = teaStallId;
		this.name = name;
		this.ownerName = ownerName;
		
	}

}
