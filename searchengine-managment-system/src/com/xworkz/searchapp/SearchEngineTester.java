package com.xworkz.searchapp;

import com.xworkz.searchapp.google.Google;
import com.xworkz.searchapp.searchengine.*;
public class SearchEngineTester {
	public static void main(String[] args) {
		
		SearchEngine me = new SearchEngine();
		me.toKnow(8);
		System.out.println("i am studing" + me.users);
		
		SearchEngine cousin = new SearchEngine();
		cousin.toKnow(5);
		System.out.println("cousin seraching for exam" + cousin.users);
		
		me.toGainKnowledge(5.00,cousin);
		System.out.println("i am studing" + me.users);
		System.out.println("cousin seraching for exam" + cousin.users);
		
		Google me1 = new Google();
		me1.toKnow(8);
		System.out.println("i am studing" + me1.users);
		
		Google cousin1 = new Google();
		cousin1.toKnow(5);
		System.out.println("cousin seraching for exam" + cousin1.users);
		
		me.toGainKnowledge(5.00,cousin1);
		System.out.println("i am studing" + me1.users);
		System.out.println("cousin seraching for exam" + cousin1.users);

		
	}
}
