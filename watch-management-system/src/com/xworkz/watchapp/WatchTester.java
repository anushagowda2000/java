package com.xworkz.watchapp;

public class WatchTester {
   public static void main(String[] args) {
	   
	   Watch wat = new Watch("W12", "boat","pink",1499, "smart");
	   System.out.println(wat.watchId + " " + wat.brandName + " " + wat.colour + " " + wat.price + " " + wat.type);
	   
	   Watch wat1 = new Watch("W342", "noise","black",3999, "digital");
	   System.out.println(wat1.watchId + " " + wat1.brandName + " " + wat1.colour + " " + wat1.price + " " + wat1.type);
	   
	   Watch wat2 = new Watch("W152", "samsung galaxy","green",2899, "diving");
	   System.out.println(wat2.watchId + " " + wat2.brandName + " " + wat2.colour + " " + wat2.price + " " + wat2.type);   
	   
   }
}
