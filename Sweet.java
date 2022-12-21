package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class Sweet {
	public static void main(String[] args) {
		String sweet= " milk peda";
		String sweet1= "kaju katli";
		String sweet2= "ladoo";
		String sweet3= "modak";
		String sweet4= "rasgulla";
		String sweet5= "rabdi";
		String sweet6= "champakali";
		String sweet7= "barfi";
		String sweet8= "basundi";
		String sweet9= "mysore pak";
		String sweet10= "shankarpali";
		String sweet11= "sohan papdi";
		String sweet12= "ghevar";
		
		Collection<String> collection = new ArrayList();
		collection.add(sweet12);
		collection.add(sweet11);
		collection.add(sweet10);
		collection.add(sweet9);
		collection.add(sweet8);
		collection.add(sweet7);
		collection.add(sweet6);
		collection.add(sweet5);
		collection.add(sweet4);
		collection.add(sweet3);
		collection.add(sweet2);
		collection.add(sweet1);
		collection.add(sweet);
		
		System.out.println(collection.size());
		
		collection.clear();
		
		System.out.println(collection.size());
	}

}
