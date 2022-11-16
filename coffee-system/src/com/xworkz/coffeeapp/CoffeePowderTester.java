package com.xworkz.coffeeapp;

import com.xworkz.coffeeapp.coffeepowder.CoffeePowder;
import com.xworkz.coffeeapp.levista.Levista;

public class CoffeePowderTester {
public static void main(String[] args) {
	CoffeePowder me = new CoffeePowder();
	me.prepare(100);
	System.out.println("me preparing coffee" + me.price);
	
	CoffeePowder sister = new CoffeePowder();
	sister.prepare(40);
	System.out.println("me serving coffer to sister" + sister.price);
	
	me.toServe(40.00, sister);
	System.out.println("me preparing coffee" + me.price);
	System.out.println("me serving coffer to sister" + sister.price);



	Levista levista = new Levista();
	levista.prepare(100);
	System.out.println("me preparing coffee" + levista.price);
	
	Levista levista1 = new Levista();
	levista1.prepare(40);
	System.out.println("me serving coffer to levista1" + levista1.price);
	
	levista.toServe(40.00, levista1);
	System.out.println("me preparing coffee" + levista.price);
	System.out.println("me serving coffer to levista1" + levista1.price);
}
}
