package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.LinkedList;

public class Currencies {
	public static void main(String[] args) {
		String name = "kwanza";
		String name1 = "peso";
		String name2 = "eur";
		String name3 = "leone";
		String name4 = "pound";
		String name5 = "Austrial dollar";
		String name6 = "dirham";
		String name7 = "tala";
		String name8 = "dobar";
		String name9 = "rand";
		String name10 = "baht";
		String name11 = "lira";
		String name12 = "kina";
		String name13 = "sol";
		String name14 = "oro";
		String name15 = "Sterling";
		String name16 = "dinar";
		String name17 = "dollar";
		String name18 = "franc";
		String name19 = "loti";
		String name20 = "lari";
		String name21 = "cedi";
		String name22 = "kuna";
		String name23 = "riel";
		String name24 = "rupe";
		String name25 = "takaa";
		
		Collection<String> collection = new LinkedList();
		collection.add(name25);
		collection.add(name24);
		collection.add(name23);
		collection.add(name22);
		collection.add(name21);
		collection.add(name20);
		collection.add(name19);
		collection.add(name18);
		collection.add(name17);
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
