package com.xworkz.coffeeapp.levista;

import com.xworkz.coffeeapp.coffeepowder.CoffeePowder;

public class Levista extends CoffeePowder {

		public static void main(String[] args) {
			Levista me = new Levista();
			me.prepare(100);
			System.out.println("me preparing coffee" + me.price);
			
			Levista sister = new Levista();
			sister.prepare(40);
			System.out.println("me serving coffer to sister" + sister.price);
			
			me.toServe(40.00, sister);
			System.out.println("me preparing coffee" + me.price);
			System.out.println("me serving coffer to sister" + sister.price);
		}
		}


