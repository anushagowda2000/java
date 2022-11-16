package com.xworkz.footwearapp;

public class FootwearTester {
  public static void main(String[] args) {
	  
	  Footwear foot = new Footwear("F123","lunars","black",9,"slipper") ;
	  System.out.println(foot.footWearId + " " + foot.brandName + " " + foot.colour + " " + foot.size + " " + foot.model );
	  
	  Footwear foot1 = new Footwear("F23","walkmate","blue",7,"flipflops") ;
	  System.out.println(foot1.footWearId + " " + foot1.brandName + " " + foot1.colour + " " + foot1.size + " " + foot1.model );

	  Footwear foot2 = new Footwear("F13","paragon","white",6,"shoes") ;
	  System.out.println(foot2.footWearId + " " + foot2.brandName + " " + foot2.colour + " " + foot2.size + " " + foot2.model );
 
	  Footwear foot3 = new Footwear("F13","liberty","pink",5,"casual-wear") ;
	  System.out.println(foot3.footWearId + " " + foot3.brandName + " " + foot3.colour + " " + foot3.size + " " + foot3.model );
 
  }
}