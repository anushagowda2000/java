package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.Singer;
import com.xworkz.humanapp.humanbeing.anusha.CoffeeNaduChandu;

public class SingerTester {
	public static void main(String[] args) {
		Singer singer = new Singer();
		singer.toSing();

		CoffeeNaduChandu coffeeNaduChandu = new CoffeeNaduChandu();
		coffeeNaduChandu.toSing();
	}
}
