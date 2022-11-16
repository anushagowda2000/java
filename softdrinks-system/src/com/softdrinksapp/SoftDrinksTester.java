package com.softdrinksapp;

public class SoftDrinksTester {
  public static void main(String args[]) {
	  
	  SoftDrinks sof = new SoftDrinks("A123", "maaza", "25rs","mango","250ml");
	  System.out.println(sof.softDrinksId + " " + sof.name + " " +sof.price + " " +sof.flavour + " " + sof.quantity);
	  
	  SoftDrinks sof1 = new SoftDrinks("A1234", "coco-cola", "30rs","lemon","500ml");
	  System.out.println(sof1.softDrinksId + " " + sof1.name + " " +sof1.price + " " +sof1.flavour + " " + sof1.quantity);
	  
	  SoftDrinks sof2 = new SoftDrinks("A134", "fanta", "20rs","orange","750ml");
	  System.out.println(sof2.softDrinksId + " " + sof2.name + " " +sof2.price + " " +sof2.flavour + " " + sof2.quantity);
	  	  
	  SoftDrinks sof3 = new SoftDrinks("A234", "appy", "15rs","apple","1000ml");
	  System.out.println(sof3.softDrinksId + " " + sof3.name + " " +sof3.price + " " +sof3.flavour + " " + sof3.quantity);
	  	  
  }
}
