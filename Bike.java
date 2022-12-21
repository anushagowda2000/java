package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Bike {
	public static void main(String[] args) {
		String name = "royal enfiels";
		String name1 = "hero splendor plus";
		String name2 = "tvs apache";
		String name3 = "rx 100";
		String name4 = "yamaha yzh-r15";
		String name5 = "bajaj pulsor";
		String name6 = "dio";
		String name7 = "active";
		String name8 = "horrent";
		String name9 = "xpluse";
		String name10 = "ktm 200 duke";
		String name11 = "yamaha fz25";
		String name12 = "star city";
		String name13 = "access";
		String name14 = "kawasaki";
		String name15 = "jupiter";
		String name16 = "honda activa 6g";
		 Collection<String> collection = new LinkedHashSet();
		 collection.add(name16);
		 collection.add(name15);
		 collection.add(name14);
		 collection.add(name13);
		 collection.add(name12);
		 collection.add(name11);
		 collection.add(name10);
		 collection.add(name9);
		 collection.add(name8);
		 collection.add(name7);
		 collection.add(name6);
		 collection.add(name5);
		 collection.add(name4);
		 collection.add(name3);
		 collection.add(name2);
		 collection.add(name1);
		 collection.add(name);
		 
		System.out.println(collection.size());
		
		collection.clear();
		
		System.out.println(collection.size());
	}
}
