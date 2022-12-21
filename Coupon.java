package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Coupon {
	public static void main(String[] args) {
		String code = "SPOT1000";
		String code1 = "PAYTMFEAST";
		String code2 = "SIMPLENEW";
		String code3 = "ZOMATO";
		String code4 = "RD2022";
		String code5 = "MQ12BW22";
		String code6 = "SAVEMAX";
		String code7 = "TRYNEW";
		String code8 = "HDFCDC150";
		String code9 = "RUPAYCC150";
		String code10 = "CHEESY60";
		String code11 = "53637H";
		
		Collection<String> collection = new LinkedList();
		
		collection.add(code11);
		collection.add(code10);
		collection.add(code9);
		collection.add(code8);
		collection.add(code7);
		collection.add(code6);
		collection.add(code5);
		collection.add(code4);
		collection.add(code3);
		collection.add(code2);
		collection.add(code1);
		collection.add(code);
		
		System.out.println(collection.size());
		
		
	}
}
