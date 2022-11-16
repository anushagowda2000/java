package com.icecreamapp;

public class IceCreamTester {
   public static void main(String[] args) {
	   
	   IceCream i = new IceCream("I123","arun","chocolate",500,"1kg");
	   System.out.println(i.iceCreamId + " " +i.name + " " +i.flavour + " " + i.price + " " +i.quantity);
	   
	   IceCream i1 = new IceCream("I13","amul","vanilla",250,"500gms");
	   System.out.println(i1.iceCreamId + " " +i1.name + " " +i1.flavour + " " + i1.price + " " +i1.quantity);
	   
	   IceCream i2 = new IceCream("I23","nandini","strwaberry",150,"250gms");
	   System.out.println(i2.iceCreamId + " " +i2.name + " " +i2.flavour + " " + i2.price + " " +i2.quantity);
	    
	   IceCream i3 = new IceCream("I3","magnum","pista",100,"200gms");
	   System.out.println(i3.iceCreamId + " " +i3.name + " " +i3.flavour + " " + i3.price + " " +i3.quantity);
	    
   }
}
