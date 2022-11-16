package com.softdrinksapp;

public class SoftDrinks {
  public String softDrinksId;
  public String name;
  public String price;
  public String flavour;
  public String quantity;
  
  public SoftDrinks() {
	  
  }
  
  public SoftDrinks(String soId,String nm,String pr, String fa,String qty) {
	  System.out.println("SoftDrinks Constructor is called");
  
  softDrinksId = soId;
  name = nm;
  price = pr;
  flavour = fa;
  quantity = qty;
  }
  
  public void toGetEnergy() {
	  System.out.println("ba juice kudiyana");
  }
  
  
}
