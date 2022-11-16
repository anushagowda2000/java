package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.ecommerce.*;

public class EcommerceTester {
	public static void main(String[] args) {
		Ecommerce toShop = new Ecommerce();
		toShop.toBuy(2000);
		System.out.println("i am shopping dress" + toShop.price);

		Ecommerce toGift = new Ecommerce();
		toGift.toBuy(500);
		System.out.println("i am gifting dress" + toGift.price);

		toShop.toPresentGift(500.00, toGift);
		System.out.println("i am shopping dress + toShop.price");
		System.out.println("i am gifting dress" + toGift.price);

		Flipkart ref = new Flipkart();
		ref.toBuy(2000);
		System.out.println("the dress price is" + ref.price);

		Flipkart ref1 = new Flipkart();
		ref1.toBuy(500);
		System.out.println("the price gifting is" + ref1.price);

		ref.toPresentGift(500.00, ref1);
		System.out.println("the dress price is" + ref.price);
		System.out.println("the price gifting is" + ref1.price);

	}
}
